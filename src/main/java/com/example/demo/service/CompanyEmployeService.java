/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.CompanyEmploye;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface CompanyEmployeService {
    CompanyEmploye addNewCompanyEmploye (CompanyEmploye companyEmploye);
    
    List<CompanyEmploye> getAllCompanyEmploye();
    
    CompanyEmploye getById(Integer id);
    
    CompanyEmploye updateData(Integer id, CompanyEmploye companyEmploye);
    
    Map<String, Boolean> deleteCompanyEmploye(Integer id);
    
    
}
