/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.PaymentType;
import com.example.demo.service.PaymentTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/payment")
public class PaymentTypeContoller {
    
    @Autowired
    private PaymentTypeService paymentTypeService;
    
    @PostMapping
    public PaymentType addNew(@RequestBody PaymentType paymentType){
        return paymentTypeService.addNew(paymentType);
    }
    
    @GetMapping
    public List<PaymentType> getPaymentType(){
        return paymentTypeService.getAllPayment();
    }
    
    @GetMapping("/{id}")
    public PaymentType getById(@PathVariable (name = "id") Integer id){
        return paymentTypeService.getById(id);
    }
    
}