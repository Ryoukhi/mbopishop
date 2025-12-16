package com.xp.mbopishop.repository;

import com.xp.mbopishop.entity.Role;
import com.xp.mbopishop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Methode Critique (Authentification) ---
    Optional<User> findByEmail(String email);

    // Methode Utile (Inscription) ---
    boolean existsByEmail(String email);

    // Methode pour l'Administration ---
    List<User> findByRole(Role role);

}
