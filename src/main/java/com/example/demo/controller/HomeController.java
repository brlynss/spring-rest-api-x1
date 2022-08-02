/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.UserType;
import com.example.demo.repository.UserTypeRepository;
import com.example.demo.service.UserTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/")
public class HomeController {
    
    private UserTypeService userTypeService;
    
//    @GetMapping
//    public String getHomeController(){
//        return "Testing";
//    }
    
    @PostMapping("user-type")
    public UserType addNewUserType(@RequestBody UserType userType){
        return userTypeService.addUserType(userType);
    }
    
    @GetMapping("user-type")
    public List<UserType> getUserType(){
        return userTypeService.getAllData();
    }
    
    @GetMapping("user-type/{id}")
    public UserType getUserTypeById(@PathVariable(name = "id") Integer id){
        return userTypeService.getById(id);
    }
}
