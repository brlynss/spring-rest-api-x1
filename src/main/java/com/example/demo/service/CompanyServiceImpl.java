/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
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
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyRepository companyRepository;
    
    @Override
    public Company addNewCompany(Company company) {
        company.setBlocked(false);
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }

    @Override
    public Company getById(String id) {
        return companyRepository.findById(id).get();
    }

    @Override
    public Company updateData(String id, Company company) {
        Company updateCompany = companyRepository.findById(id).get();
        updateCompany.setLogo(company.getLogo());
        updateCompany.setName(company.getName());
        updateCompany.setDirector(company.getDirector());
        updateCompany.setPhone(company.getPhone());
        updateCompany.setNumberOfBuses(company.getNumberOfBuses());
        updateCompany.setTotalPassenger(company.getTotalPassenger());
        updateCompany.setRetingId(company.getRetingId());
        updateCompany.setAddress(company.getAddress());
        updateCompany.setAdminId(company.getAdminId());
        return companyRepository.save(updateCompany);
    }

    @Override
    public Map<String, Boolean> deleteCompany(String id) {
        Company updateCompany = companyRepository.findById(id).get();
        companyRepository.delete(updateCompany);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}
