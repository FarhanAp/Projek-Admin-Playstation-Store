/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tuselate file, choose Tools | Tuselates
 * and open the tuselate in the editor.
 */
package com.spboot.projek1.services;

import com.spboot.projek1.interfaces.UserInterface;
import com.spboot.projek1.models.User;
import com.spboot.projek1.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Deiga
 */
@Service
public class UserService implements UserInterface {
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void usestore(User user) {
        this.userRepository.save(user);
    }
    
    @Override
    public User getById(long id) {
        Optional < User > optional = userRepository.findById(id);

     if (!optional.isPresent()) {
        throw new RuntimeException(" User not found for id : " + id);
     }

    User user = optional.get();
    return user;
    }

    @Override
    public void delete(long id) {
    this.userRepository.deleteById(id);
    }
}