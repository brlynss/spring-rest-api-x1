/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.UserType;
import com.example.demo.repository.UserTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class UserTypeServiceImpl implements UserTypeService {
    
    @Autowired
    private UserTypeRepository userTypeRepository;
    

    @Override
    public UserType addUserType(UserType userType) {
        return userTypeRepository.save(userType);
    }

    @Override
    public List<UserType> getAllData() {
        return userTypeRepository.findAll();
    }

    @Override
    public UserType getById(Integer id) {
        return userTypeRepository.findById(id).get();
    }
    
}
