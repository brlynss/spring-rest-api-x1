/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.User;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface UserService {
    User addUser(User user);
    
    List<User> getAllData();
    
    User getById(Integer id);
}
