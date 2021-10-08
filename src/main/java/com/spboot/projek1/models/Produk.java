/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.projek1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Deiga
 */
@Entity
@Table(name = "produk")
public class Produk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nama Produk")
    private String Nama_Produk;

    @Column(name = "Harga Produk")
    private String Harga_Produk;

    @Column(name = "Stok Produk")
    private String Stock_Produk;

    @Column(name = "Jenis Produk")
    private String Jenis_Produk;

    @Column(name = "Id User")
    private String Id_User;

    public void setnama_Product(String Nama_produk) {
        this.Nama_Produk = Nama_Produk;
    }

    public String getnama_Product() {
        return Nama_Produk;
    }

    public void setharga_Produk(String Harga_Produk) {
        this.Harga_Produk = Harga_Produk;
    }

    public String getharga_Product() {
        return Harga_Produk;
    }

    public void setstock_Produk(String Stock_Produk) {
        this.Stock_Produk = Stock_Produk;
    }

    public String getstock_Produk() {
        return Stock_Produk;
    }

    public void setjenis_Produk(String Jenis_Produk) {
        this.Jenis_Produk = Jenis_Produk;
    }

    public String getjenis_Produk() {
        return Jenis_Produk;
    }

    public void setid_User(String Id_User) {
        this.Id_User = Id_User;
    }

    public String getid_User() {
        return Id_User;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}

