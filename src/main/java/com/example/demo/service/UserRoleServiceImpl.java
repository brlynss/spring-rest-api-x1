/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.UserRole;
import com.example.demo.repository.UserRoleRepository;
import java.util.List;
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
    
}
