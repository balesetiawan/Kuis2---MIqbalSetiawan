/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis1049.entity;

/**
 *
 * @author PC26
 */
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "Aksesoris_1049")
public class Aksesoris_1049 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aksesoris;
     @Column(length = 100, nullable = false, unique = true)
    private String nama_aksesoris;
    @Column(length = 255, nullable = true)
    private String tipe_aksesoris;
    @Column(name="harga_aksesoris")
    private Long harga_aksesoris;
    @Column
    private Long id_mobil;

    public Long getId() {
        return id_aksesoris;
    }

    public void setId(Long id) {
        this.id_aksesoris = id;
    }

    /**
     * @return the name
     */
    public String getNama_aksesoris() {
        return nama_aksesoris;
    }

    /**
     * @param name the name to set
     */
    public void setNama_aksesoris(String name) {
        this.nama_aksesoris = name;
    }

    /**
     * @return the description
     */
    public String getTipe_Aksesoris() {
        return tipe_aksesoris;
    }

    /**
     * @param description the description to set
     */
    public void setTipe_aksesoris(String description) {
        this.tipe_aksesoris = description;
    }

    
    public Long getHarga_Aksesoris() {
        return harga_aksesoris;
    }

    /**
     * @param description the description to set
     */
    public void setHarga_aksesoris(Long description) {
        this.harga_aksesoris = description;
    }
     public Long getId_mobil() {
        return id_mobil;
    }

    public void setId_mobil(Long id) {
        this.id_mobil = id;
    }
    /**
     * @return the name
     */
    
}
