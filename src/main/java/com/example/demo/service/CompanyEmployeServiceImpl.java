/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.CompanyEmploye;
import com.example.demo.repository.CompanyEmployeRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class CompanyEmployeServiceImpl implements CompanyEmployeService{
    
    @Autowired
    private CompanyEmployeRepository companyEmployeRepository;

    @Override
    public CompanyEmploye addNewCompanyEmploye(CompanyEmploye companyEmploye) {
        companyEmploye.setWork(false);
        return companyEmployeRepository.save(companyEmploye);
    }

    @Override
    public List<CompanyEmploye> getAllCompanyEmploye() {
        return companyEmployeRepository.findAll();
    }

    @Override
    public CompanyEmploye getById(Integer id) {
        return companyEmployeRepository.findById(id).get();
    }

    @Override
    public CompanyEmploye updateData(Integer id, CompanyEmploye companyEmploye) {
        CompanyEmploye updateUserRole = companyEmployeRepository.findById(id).get();
        updateUserRole.setCompanyId(companyEmploye.getCompanyId());
        updateUserRole.setEmployeId(companyEmploye.getEmployeId());
        updateUserRole.setLatitude(companyEmploye.getLatitude());
        updateUserRole.setLongitude(companyEmploye.getLongitude());
        return companyEmployeRepository.save(updateUserRole);
    }

    @Override
    public Map<String, Boolean> deleteCompanyEmploye(Integer id) {
        CompanyEmploye updateCompanyEmploye = companyEmployeRepository.findById(id).get();
        companyEmployeRepository.delete(updateCompanyEmploye);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}
