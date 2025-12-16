package com.xp.mbopishop.service.interfaces;

import com.xp.mbopishop.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserInterface {

    // créer ou mettre à jour un utilisateur
    public User saveUser(User user);

    // récupérer tous les utilisateurs
    public List<User> getAllUsers();

    // récupérer un utilisateur par son id
    public Optional<User> getUserById(Long id);

    // supprimer un utilisateur
    public void deleteUser(Long id);

    // rechercher un utilisateur par son email
    public User findByEmail(String email);

    // verifier si un utilisateur existe par son email
    public boolean existsById(Long id);

}
