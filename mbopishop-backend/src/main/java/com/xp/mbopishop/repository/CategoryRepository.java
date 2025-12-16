package com.xp.mbopishop.repository;

import com.xp.mbopishop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    // 1. Recherche : Par nom exact
    Optional<Category> findByName(String name);

    // 2. Vérification : Existence par nom
    boolean existsByName(String name);

    // 3. Recherche : Par nom partiel (IgnoreCase)
    List<Category> findByNameContainingIgnoreCase(String keyword);

    // 4. Performance : Récupérer la catégorie et ses produits en une seule requête
    @Query("SELECT c FROM Category c JOIN FETCH c.products WHERE c.id = :id")
    Optional<Category> findByIdWithProducts(@Param("id") Long id);

    // 5. Statistiques : Compter les produits par catégorie
    @Query("SELECT c.name, COUNT(p.id) FROM Category c JOIN c.products p GROUP BY c.name")
    List<Object[]> countProductsByCategory();

}