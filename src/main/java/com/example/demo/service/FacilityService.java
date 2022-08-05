/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Facility;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface FacilityService {
    Facility addNewFacility (Facility facility);
    
    List<Facility> getAllFacility();
    
    Facility getById(Integer id);
    
    Facility updateData(Integer id, Facility facility);
    
    Map<String, Boolean> deleteFacility(Integer id);


}
