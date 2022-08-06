/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Useres;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface UseresService {
    Useres addNewUseres (Useres useres);
    
    List<Useres> getAllUseres();
    
    Useres getById(String id);
    
    Useres updateData(String id, Useres useres);
    
    Map<String, Boolean> deleteUseres(String id);
}
