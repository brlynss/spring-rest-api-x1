/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Company;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface CompanyService {
    Company addNewCompany (Company company);
    
    List<Company> getAllCompany();
    
    Company getById(String id);
    
    Company updateData(String id, Company company);
    
    Map<String, Boolean> deleteCompany(String id);
}
