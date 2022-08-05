/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.UserRole;
import com.example.demo.repository.UserRoleRepository;
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
public class UserRoleServiceImpl implements UserRoleService {
    
    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public UserRole addNewRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public List<UserRole> getAllData(){
        return userRoleRepository.findAll();
    }

    @Override
    public UserRole getById(Integer id) {
        return userRoleRepository.findById(id).get();
    }

    @Override
    public UserRole updateData(Integer id, UserRole userRole) {
        UserRole updateUserRole = userRoleRepository.findById(id).get();
        updateUserRole.setName(userRole.getName());
        return userRoleRepository.save(updateUserRole);
    }

    @Override
    public Map<String, Boolean> deleteUserRole(Integer id) {
        UserRole updateUserRole = userRoleRepository.findById(id).get();
        userRoleRepository.delete(updateUserRole);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
    
}
