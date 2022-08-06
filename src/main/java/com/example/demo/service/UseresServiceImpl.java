/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Useres;
import com.example.demo.repository.UseresRepository;
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
public class UseresServiceImpl implements UseresService {
    
    @Autowired
    private UseresRepository useresRepository;

    @Override
    public Useres addNewUseres(Useres useres) {
        return useresRepository.save(useres);
    }

    @Override
    public List<Useres> getAllUseres() {
        return useresRepository.findAll();
    }

    @Override
    public Useres getById(String id) {
        return useresRepository.findById(id).get();
    }

    @Override
    public Useres updateData(String id, Useres useres) {
        Useres updateUseres = useresRepository.findById(id).get();
        updateUseres.setFirstName(useres.getFirstName());
        updateUseres.setLastName(useres.getLastName());
        updateUseres.setEmail(useres.getEmail());
        updateUseres.setPassword(useres.getPassword());
        updateUseres.setNumberPhone(useres.getNumberPhone());
        updateUseres.setDateOfBirth(useres.getDateOfBirth());
        updateUseres.setBlocked(useres.getBlocked());
        updateUseres.setAddress(useres.getAddress());
        updateUseres.setRoles(useres.getRoles());
        return useresRepository.save(updateUseres);
    }

    @Override
    public Map<String, Boolean> deleteUseres(String id) {
        Useres updateUseres = useresRepository.findById(id).get();
        useresRepository.delete(updateUseres);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}
