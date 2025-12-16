package com.xp.mbopishop.repository;


import com.xp.mbopishop.entity.Order;
import com.xp.mbopishop.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    // Trouver un paiement par commande
    Optional<Payment> findByOrder(Order order);

    // Trouver un paiement par l'ID de la commande
    Optional<Payment> findByOrderId(Long orderId);

    // Trouver les paiements réussis
    List<Payment> findBySuccess(boolean success);

    // Trouver les paiements par méthode de paiement
    List<Payment> findByPaymentMethod(String paymentMethod);

    // Trouver les paiements entre deux dates
    List<Payment> findByPaymentDateBetween(LocalDateTime startDate, LocalDateTime endDate);

    // Trouver les paiements réussis par méthode
    List<Payment> findBySuccessAndPaymentMethod(boolean success, String paymentMethod);

    // Trouver les paiements réussis entre deux dates
    List<Payment> findBySuccessAndPaymentDateBetween(boolean success, LocalDateTime startDate, LocalDateTime endDate);

    // Vérifier si une commande a un paiement
    boolean existsByOrderId(Long orderId);

    // Vérifier si une commande a un paiement réussi
    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Payment p WHERE p.order.id = :orderId AND p.success = true")
    boolean hasSuccessfulPayment(@Param("orderId") Long orderId);

    // Compter les paiements réussis
    long countBySuccess(boolean success);

    // Compter les paiements par méthode
    long countByPaymentMethod(String paymentMethod);

    // Trouver les paiements d'un utilisateur via la commande
    @Query("SELECT p FROM Payment p WHERE p.order.user.id = :userId")
    List<Payment> findByUserId(@Param("userId") Long userId);

    // Trouver les paiements réussis d'un utilisateur
    @Query("SELECT p FROM Payment p WHERE p.order.user.id = :userId AND p.success = true")
    List<Payment> findSuccessfulPaymentsByUserId(@Param("userId") Long userId);

    // Calculer le montant total des paiements réussis dans une période
    @Query("SELECT SUM(p.order.totalAmount) FROM Payment p WHERE p.success = true AND p.paymentDate BETWEEN :startDate AND :endDate")
    Double getTotalSuccessfulPaymentsAmount(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
}
