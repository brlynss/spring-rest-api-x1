/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.PaymentType;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface PaymentTypeService {
    PaymentType addNew(PaymentType paymentType);
   
    List<PaymentType> getAllPayment();
    
    PaymentType getById(Integer id);
}
