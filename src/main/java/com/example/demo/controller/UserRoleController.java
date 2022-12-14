/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.UserRole;
import com.example.demo.service.UserRoleService;
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
@RequestMapping("/user-role")
public class UserRoleController {
    
    @Autowired
    private UserRoleService userRoleService;
    
    @PostMapping
    public UserRole addNewUserRole(@RequestBody UserRole userRole){
        return userRoleService.addNewRole(userRole);
    }
//    
    @GetMapping("/list")
    public List<UserRole> getAllUserRole(){
        return userRoleService.getAllData();
    }
//    
    @GetMapping("/{id}")
    public UserRole getById(@PathVariable (name = "id")Integer id){
        return userRoleService.getById(id);
    }
    
    @PutMapping("/{id}")
    public UserRole updateData(@PathVariable("id") Integer id, @RequestBody UserRole userRole){
        return userRoleService.updateData(id, userRole);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteUserRole(@PathVariable("id") Integer Id){
        return userRoleService.deleteUserRole(Id);
    }
}
