/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis1049.service;

import com.example.tib.kuis1049.repo.Aksesoris_1049Repo;
import com.example.tib.kuis1049.entity.Aksesoris_1049;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("aksesorisService")
@Transactional
public class Aksesoris_1049Service {

    @Autowired
    private Aksesoris_1049Repo repo;

    public Aksesoris_1049 insert(Aksesoris_1049 mobil_1049) {
        return repo.save(mobil_1049);
    }
    
    public Aksesoris_1049 update(Aksesoris_1049 mobil_1049) {
        return repo.save(mobil_1049);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Aksesoris_1049 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Aksesoris_1049> getAll(){
        return repo.findAllAksesoris_1049();
    }
}