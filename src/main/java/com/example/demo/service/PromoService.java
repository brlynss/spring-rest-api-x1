/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Promo;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface PromoService {
    Promo addNewPromo (Promo promo);
    
    List<Promo> getAllPromo();
    
    Promo getById(Integer id);
    
    Promo updateData(Integer id, Promo promo);
    
    Map<String, Boolean> deletePromo(Integer id);
}
