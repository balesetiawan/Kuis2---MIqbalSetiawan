/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis1049.repo;

import com.example.tib.kuis1049.entity.Mobil_1049;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Mobil_1049Repo extends CrudRepository<Mobil_1049, Long> {

    @Query("select c from Mobil_1049 c")
    public List<Mobil_1049> findAllMobil_1049();
}