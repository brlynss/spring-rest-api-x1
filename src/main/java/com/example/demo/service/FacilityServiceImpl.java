/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Facility;
import com.example.demo.repository.FacilityRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class FacilityServiceImpl implements FacilityService{
    
    @Autowired
    private FacilityRepository facilityRepository;

    @Override
    public Facility addNewFacility(Facility facility) {
        return facilityRepository.save(facility);
    }

    @Override
    public List<Facility> getAllFacility() {
        return facilityRepository.findAll();
    }

    @Override
    public Facility getById(Integer id) {
        return facilityRepository.findById(id).get();
    }

    @Override
    public Facility updateData(Integer id, Facility facility) {
        Facility updateFacility = facilityRepository.findById(id).get();
        updateFacility.setName(facility.getName());
        updateFacility.setCreated(facility.getCreated());
        updateFacility.setUpdated(facility.getUpdated());
        return facilityRepository.save(updateFacility);
    }

    @Override
    public Map<String, Boolean> deleteFacility(Integer id) {
        Facility updateFacility = facilityRepository.findById(id).get();
        facilityRepository.delete(updateFacility);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}
