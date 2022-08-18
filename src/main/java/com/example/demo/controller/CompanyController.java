/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.response.CommonResponse;
import com.example.demo.response.CommonResponseGenerator;
import com.example.demo.service.CompanyService;
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
@RequestMapping("/company")
public class CompanyController {
    
    @Autowired
    private CompanyService companyService;
    
    @PostMapping
    public Company addNewCompany(@RequestBody Company company){
        return companyService.addNewCompany(company);
    }

    @GetMapping
    public List<Company> getAllUserRole(){
        return companyService.getAllCompany();
    }

    @GetMapping("/{id}")
    public CommonResponse<Company> getById(@PathVariable (name = "id")String id){
        try {
             return CommonResponseGenerator.successResponse(companyService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
    }
    
    @PutMapping("/{id}")
    public Company updateData(@PathVariable("id") String id, @RequestBody Company company){
        return companyService.updateData(id, company);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteCompany(@PathVariable("id") String Id){
        return companyService.deleteCompany(Id);
    }
    
}
