package com.xp.mbopishop.repository;



import com.xp.mbopishop.entity.Order;
import com.xp.mbopishop.entity.OrderStatus;
import com.xp.mbopishop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    // Trouver toutes les commandes d'un utilisateur
    List<Order> findByUser(User user);

    // Trouver les commandes par l'ID de l'utilisateur
    List<Order> findByUserId(Long userId);

    // Trouver les commandes par statut
    List<Order> findByStatus(OrderStatus status);

    // Trouver les commandes d'un utilisateur par statut
    List<Order> findByUserIdAndStatus(Long userId, OrderStatus status);

    // Trouver les commandes entre deux dates
    List<Order> findByOrderDateBetween(LocalDateTime startDate, LocalDateTime endDate);

    // Trouver les commandes d'un utilisateur entre deux dates
    List<Order> findByUserIdAndOrderDateBetween(Long userId, LocalDateTime startDate, LocalDateTime endDate);

    // Trouver les commandes par montant minimum
    List<Order> findByTotalAmountGreaterThanEqual(double minAmount);

    // Trouver les commandes d'un utilisateur triées par date (les plus récentes d'abord)
    List<Order> findByUserIdOrderByOrderDateDesc(Long userId);

    // Compter les commandes d'un utilisateur
    long countByUserId(Long userId);

    // Compter les commandes par statut
    long countByStatus(OrderStatus status);

    // Vérifier si un utilisateur a des commandes
    boolean existsByUserId(Long userId);

    // Calculer le montant total des commandes d'un utilisateur
    @Query("SELECT SUM(o.totalAmount) FROM Order o WHERE o.user.id = :userId")
    Double getTotalAmountByUserId(@Param("userId") Long userId);

    // Trouver les dernières commandes d'un utilisateur (avec limite)
    @Query("SELECT o FROM Order o WHERE o.user.id = :userId ORDER BY o.orderDate DESC")
    List<Order> findRecentOrdersByUserId(@Param("userId") Long userId);
}
