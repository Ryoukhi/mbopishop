package com.xp.mbopishop.repository;

import com.xp.mbopishop.entity.Category;
import com.xp.mbopishop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    // 1. Recherche : Moteur de recherche
    List<Product> findByNameContainingIgnoreCase(String keyword);

    // 2. Filtration : Par catégorie
    List<Product> findByCategory(Category category);

    // 3. Filtration : Par prix
    List<Product> findByPriceBetween(double minPrice, double maxPrice);

    // 4. Filtration : Disponibilité
    List<Product> findByStockGreaterThan(int minStock);

    // 5. Combinaison de filtres (Catégorie et Stock)
    List<Product> findByCategoryAndStockGreaterThan(Category category, int minStock);

    // 6. Pagination : Essentielle pour le catalogue (héritée, mais listée ici pour rappel)
    // Page<Product> findAll(Pageable pageable);

    // 7. Requête JPQL avec Fetch Join pour performance
    @Query("SELECT p FROM Product p JOIN FETCH p.category WHERE p.name LIKE %:nameKeyword%")
    List<Product> findByNameWithCategoryLoaded(@Param("nameKeyword") String nameKeyword);

}

