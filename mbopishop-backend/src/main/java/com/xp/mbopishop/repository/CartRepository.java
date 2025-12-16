package com.xp.mbopishop.repository;


import com.xp.mbopishop.entity.Cart;
import com.xp.mbopishop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    // Exemple d'une méthode personnalisée pour trouver le panier d'un utilisateur spécifique
    Optional<Cart> findByUser(User user);

    // Ou par l'ID de l'utilisateur
    Optional<Cart> findByUserId(Long userId);

    // Vérifier si un panier existe pour un utilisateur
    boolean existsByUserId(Long userId);

    // Supprimer un panier par l'ID de l'utilisateur
    void deleteByUserId(Long userId);
}
