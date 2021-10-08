/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.projek1.controllers;


import com.spboot.projek1.interfaces.ProdukInterface;
import com.spboot.projek1.models.Produk;
import static javax.swing.text.StyleConstants.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Deiga
 */
@Controller
public class ProdukController {

    @Autowired
    private ProdukInterface produkInterface;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", produkInterface.getAll());
        return "index";
    }

    @GetMapping("/produk/create")
    public String create(Model model) {
        
        Produk produk = new Produk();
        model.addAttribute("produk", produk);
        
        return "create";
    }

    @PostMapping("/produk/produk")
    public String store(@ModelAttribute("produk") Produk produk) {
        produkInterface.produk(produk);
        return "redirect:/";
    }
}