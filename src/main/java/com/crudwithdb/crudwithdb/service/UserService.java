package com.crudwithdb.crudwithdb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudwithdb.crudwithdb.model.User;
import com.crudwithdb.crudwithdb.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;

    public User register(User user) {
        // Ici on devrait encoder le mot de passe avec BCrypt
        return userRepo.save(user);
    }

    public boolean login(String username, String password) {
        Optional<User> userOpt = userRepo.findByUsername(username);
        return userOpt.isPresent() && userOpt.get().getPassword().equals(password);
    }

}
