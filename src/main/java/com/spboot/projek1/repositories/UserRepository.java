/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.projek1.repositories;

import com.spboot.projek1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author Deiga
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}