/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.UserRole;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface UserRoleService {
    UserRole addNewRole (UserRole userRole);
    
    List<UserRole> getAllData();
    
    UserRole getById(Integer id);
    
    UserRole updateData(Integer id, UserRole userRole);
    
    Map<String, Boolean> deleteUserRole(Integer id);
}
