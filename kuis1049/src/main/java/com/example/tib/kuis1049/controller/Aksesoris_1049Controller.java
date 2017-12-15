/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis1049.controller;

import com.example.tib.kuis1049.entity.Aksesoris_1049;
import com.example.tib.kuis1049.service.Aksesoris_1049Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/aksesoris_1049")
public class Aksesoris_1049Controller {

    @Autowired
    private Aksesoris_1049Service aksesoris_1049Service;

    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris_1049 insert(@RequestBody Aksesoris_1049 category) {
        return aksesoris_1049Service.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Aksesoris_1049 update(@RequestBody Aksesoris_1049 category) {
        return aksesoris_1049Service.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id_aksesoris") Long id) {
        return aksesoris_1049Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Aksesoris_1049 getById(@PathVariable("id_aksesoris") Long id){
        return aksesoris_1049Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris_1049> getAll(){
        return aksesoris_1049Service.getAll();
    }
}
