/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.projek1.repositories;


import com.spboot.projek1.models.Produk;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Deiga
 */
public interface ProdukRepository extends JpaRepository<Produk, Long> {
    
}