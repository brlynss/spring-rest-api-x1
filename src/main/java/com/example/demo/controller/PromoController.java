/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Promo;
import com.example.demo.response.CommonResponse;
import com.example.demo.response.CommonResponseGenerator;
import com.example.demo.service.PromoService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/promo")
public class PromoController {
    
    @Autowired
    private PromoService promoService;
    
    @PostMapping
    public Promo addNewPromo(@RequestBody Promo promo){
        return promoService.addNewPromo(promo);
    }

    @GetMapping
    public List<Promo> getAllUserRole(){
        return promoService.getAllPromo();
    }

    @GetMapping("/get/{id}")
    public CommonResponse<Promo> getById(@PathVariable ("id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(promoService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
       
    }
    
    @PutMapping("/{id}")
    public Promo updateData(@PathVariable("id") Integer id, @RequestBody Promo facility){
        return promoService.updateData(id, facility);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deletePromo(@PathVariable("id") Integer Id){
        return promoService.deletePromo(Id);
    }
}
