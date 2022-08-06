/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Useres;
import com.example.demo.service.UseresService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/useres")
public class UseresController {
    
    @Autowired
    private UseresService useresService;
    
    @PostMapping
    public Useres addNewUserRole(@RequestBody Useres useres){
        return useresService.addNewUseres(useres);
    }
  
    @GetMapping
    public List<Useres> getAllUseres(){
        return useresService.getAllUseres();
    }
    
    @GetMapping("/{id}")
    public Useres getById(@PathVariable (name = "id")String id){
        return useresService.getById(id);
    }
    
    @PutMapping("/{id}")
    public Useres updateData(@PathVariable("id") String id, @RequestBody Useres useres){
        return useresService.updateData(id, useres);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteUseres(@PathVariable("id") String Id){
        return useresService.deleteUseres(Id);
    }
}
