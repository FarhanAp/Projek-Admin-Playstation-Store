/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tuslate file, choose Tools | Tuslates
 * and open the tuslate in the editor.
 */
package com.spboot.projek1.interfaces;

import com.spboot.projek1.models.User;
import java.util.List;



/**
 *
 * @author Deiga
 */
public interface UserInterface {
    List<User> getAll();
    void usestore(User user);
    User getById(long id);
    void delete(long id);
}