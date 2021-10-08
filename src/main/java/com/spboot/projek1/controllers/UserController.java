/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tuselate file, choose Tools | Tuselates
 * and open the tuselate in the editor.
 */
package com.spboot.projek1.controllers;

import com.spboot.projek1.interfaces.UserInterface;
import com.spboot.projek1.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Deiga
 */
@Controller
public class UserController {
    @Autowired
    private UserInterface userInterface;

    @GetMapping("/user")
    public String useindex(Model model) {
        model.addAttribute("list", userInterface.getAll());
        return "user/useindex";
    }

    @GetMapping("/user/usecreate")
    public String usecreate(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        
        return "user/usecreate";
    }

    @PostMapping("/user/usestore")
    public String usestore(@ModelAttribute("user") User user) {
        userInterface.usestore(user);
        return "redirect:/user/";
    }
    
    @GetMapping("/user/{id}/useedit")
    public String useedit(@PathVariable(value = "id") long id, Model model) {
        User user = userInterface.getById(id);

        model.addAttribute("user", user);
        return "user/useedit";
    }

    @PostMapping("/user/{id}/delete")
    public String delete(@PathVariable(value = "id") long id) {
        userInterface.delete(id);
        return "redirect:/user/" ;
    }
}