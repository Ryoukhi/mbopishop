package com.xp.mbopishop.service.interfaces;

import com.xp.mbopishop.entity.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryInterface {

    // créer ou metre à jour une catégorie
    public Category saveCategory(Category category);

    // récupérer toutes les catégories
    public List<Category> getAllCategories();

    // récupérer une catégorie par son id
    public Category getCategoryById(Long id);

    // supprimer une catégorie
    public void deleteCategory(Long id);

    // rechercher une categorie par son nom
    Optional<Category> findByName(String name);

    // verifier si une categorie existe 
    public boolean existsById(Long id);

}
