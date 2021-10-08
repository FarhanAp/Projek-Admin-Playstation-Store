/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.projek1.interfaces;
import com.spboot.projek1.models.Produk;
import java.util.List;

/**
 *
 * @author Deiga
 */
public interface ProdukInterface {
    List<Produk> getAll();
    void produk(Produk produk);
}
