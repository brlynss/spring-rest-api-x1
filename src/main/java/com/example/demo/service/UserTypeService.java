/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.UserType;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface UserTypeService {
    UserType addUserType(UserType userType);
    
    List<UserType> getAllData();
    
    UserType getById(Integer id);
}
