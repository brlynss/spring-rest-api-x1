/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.PaymentType;
import com.example.demo.repository.PaymentTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class PaymentTypeServiceImpl implements PaymentTypeService {
    
    @Autowired
    private PaymentTypeRepository paymentTypeRepository;

    @Override
    public PaymentType addNew(PaymentType paymentType) {
        return paymentTypeRepository.save(paymentType);
    }

    @Override
    public List<PaymentType> getAllPayment() {
        return paymentTypeRepository.findAll();
    }

    @Override
    public PaymentType getById(Integer id) {
        return paymentTypeRepository.findById(id).get();
    }
    
}
