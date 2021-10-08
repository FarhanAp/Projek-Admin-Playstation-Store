/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this ttralate file, choose Tools | Ttralates
 * and open the ttralate in the editor.
 */
package com.spboot.projek1.controllers;

import com.spboot.projek1.interfaces.TransaksiInterface;
import com.spboot.projek1.models.Transaksi;
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
public class TransaksiController {
    @Autowired
    private TransaksiInterface transaksiInterface;

    @GetMapping("/transaksi")
    public String traindex(Model model) {
        model.addAttribute("list", transaksiInterface.getAll());
        return "transaksi/traindex";
    }

    @GetMapping("/transaksi/tracreate")
    public String tracreate(Model model) {
        Transaksi transaksi = new Transaksi();
        model.addAttribute("transaksi", transaksi);
        
        return "transaksi/tracreate";
    }

    @PostMapping("/transaksi/trastore")
    public String trastore(@ModelAttribute("transaksi") Transaksi transaksi) {
        transaksiInterface.trastore(transaksi);
        return "redirect:/transaksi/";
    }
    
    @GetMapping("/transaksi/{id}/traedit")
    public String traedit(@PathVariable(value = "id") long id, Model model) {
        Transaksi transaksi = transaksiInterface.getById(id);

        model.addAttribute("transaksi", transaksi);
        return "transaksi/traedit";
    }

    @PostMapping("/transaksi/{id}/delete")
    public String delete(@PathVariable(value = "id") long id) {
        transaksiInterface.delete(id);
        return "redirect:/transaksi/" ;
    }
}