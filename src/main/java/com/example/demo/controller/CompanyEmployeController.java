/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.CompanyEmploye;
import com.example.demo.response.CommonResponse;
import com.example.demo.response.CommonResponseGenerator;
import com.example.demo.service.CompanyEmployeService;
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
@RequestMapping("/company-employe")
public class CompanyEmployeController {
    
    @Autowired
    private CompanyEmployeService companyEmployeService;
    
   @PostMapping
    public CompanyEmploye addNewCompanyEmploye(@RequestBody CompanyEmploye companyEmploye){
        return companyEmployeService.addNewCompanyEmploye(companyEmploye);
    }
    
    @GetMapping
    public List<CompanyEmploye> getAllCompanyEmploye(){
        return companyEmployeService.getAllCompanyEmploye();
    }
    
    @GetMapping("/{id}")
    public CommonResponse<CompanyEmploye> getById(@PathVariable (name = "id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(companyEmployeService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
    }
    
    @PutMapping("/{id}")
    public CommonResponse<CompanyEmploye> updateData(@PathVariable("id") Integer id, @RequestBody CompanyEmploye companyEmploye){
        try {
             return CommonResponseGenerator.successResponse(companyEmployeService.updateData(id, companyEmploye));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteCompanyEmploye(@PathVariable("id") Integer Id){
        return companyEmployeService.deleteCompanyEmploye(Id);
    }
    
}
