package com.xp.mbopishop.service.interfaces;

import com.xp.mbopishop.entity.Product;
import java.util.List;


public interface ProductInterface {
    
    // créer ou mettre à jour un produit
    public Product saveProduct(Product product);

    // récupérer tous les produits
    public List<Product> getAllProducts();

    // récupérer un produit par son id
    public Product getProductById(Long id);

    // supprimer un produit
    public void deleteProduct(Long id);

    // recuperer les produits d'une catégorie
    public List<Product> getProductsByCategory(Long categoryId);

    // rechercher un produit par son nom
    List<Product> findByNameContaining(String name);

    // verifier si un produit existe
    public boolean existsById(Long id);

    // Produit disponible en stcock
    public List<Product> findByStockGListreaterThan(int stock);

}
