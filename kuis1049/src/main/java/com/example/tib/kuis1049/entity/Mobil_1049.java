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
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Mobil_1049")
public class Mobil_1049 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mobil;
    @Column(length = 100, nullable = false, unique = true)
    private String merek_mobil;
    @Column(length = 255, nullable = true)
    private String tipe_mobil;
    @Column(nullable = true)
    private int harga_mobil;
   @OneToMany
   @JoinColumn(name="id_mobil")
   private Set<Aksesoris_1049> aksesoris;

    public Long getId_mobil() {
        return id_mobil;
    }

    public void setId_mobil(Long id) {
        this.id_mobil = id;
    }

    /**
     * @return the name
     */
    public String getMerek_mobil() {
        return merek_mobil;
    }

    /**
     * @param name the name to set
     */
    public void setMerek_mobil(String name) {
        this.merek_mobil = name;
    }

    /**
     * @return the description
     */
    public String getTipe_mobil() {
        return tipe_mobil;
    }

    /**
     * @param description the description to set
     */
    public void setTipe_mobil(String description) {
        this.tipe_mobil = description;
    }
    
    public int getHarga_mobil() {
        return harga_mobil;
    }

    /**
     * @param description the description to set
     */
    public void setHarga_mobil(int description) {
        this.harga_mobil = description;
    }

    /**
     * @return the name
     */
    
}
