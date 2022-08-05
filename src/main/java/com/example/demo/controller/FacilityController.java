/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Facility;
import com.example.demo.service.FacilityService;
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
@RequestMapping("/facility")
public class FacilityController {
    
    @Autowired
    private FacilityService facilityService;
    
    @PostMapping
    public Facility addNewFacility(@RequestBody Facility facility){
        return facilityService.addNewFacility(facility);
    }
//    
    @GetMapping
    public List<Facility> getAllUserRole(){
        return facilityService.getAllFacility();
    }
//    
    @GetMapping("/{id}")
    public Facility getById(@PathVariable (name = "id")Integer id){
        return facilityService.getById(id);
    }
    
    @PutMapping("/{id}")
    public Facility updateData(@PathVariable("id") Integer id, @RequestBody Facility facility){
        return facilityService.updateData(id, facility);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteFacility(@PathVariable("id") Integer Id){
        return facilityService.deleteFacility(Id);
    }
    
}
