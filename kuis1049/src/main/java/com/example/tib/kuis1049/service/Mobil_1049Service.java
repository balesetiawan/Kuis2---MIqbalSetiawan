/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis1049.service;

import com.example.tib.kuis1049.repo.Mobil_1049Repo;
import com.example.tib.kuis1049.entity.Mobil_1049;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("mobilService")
@Transactional
public class Mobil_1049Service {

    @Autowired
    private Mobil_1049Repo repo;

    public Mobil_1049 insert(Mobil_1049 mobil_1049) {
        return repo.save(mobil_1049);
    }
    
    public Mobil_1049 update(Mobil_1049 mobil_1049) {
        return repo.save(mobil_1049);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Mobil_1049 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Mobil_1049> getAll(){
        return repo.findAllMobil_1049();
    }
}
