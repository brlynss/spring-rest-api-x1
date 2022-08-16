/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Promo;
import com.example.demo.repository.PromoRepository;
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
public class PromoServiceImpl implements PromoService{
    
    @Autowired
    private PromoRepository promoRepository;

    @Override
    public Promo addNewPromo(Promo promo) {
        promo.setUsed(0);
        return promoRepository.save(promo);
    }

    @Override
    public List<Promo> getAllPromo() {
        return promoRepository.findAll();
    }

    @Override
    public Promo getById(Integer id) {
        return promoRepository.findById(id).get();
    }

    @Override
    public Promo updateData(Integer id, Promo promo) {
        Promo updatePromo = promoRepository.findById(id).get();
        updatePromo.setImage(promo.getImage());
        updatePromo.setCode(promo.getCode());
        updatePromo.setDescription(promo.getDescription());
        updatePromo.setExpiredDate(promo.getExpiredDate());
        updatePromo.setMaxUse(promo.getMaxUse());
        updatePromo.setUsed(promo.getUsed());
        updatePromo.setAllCompany(promo.getAllCompany());
        updatePromo.setCompanyId(promo.getCompanyId());
        updatePromo.setCreated(promo.getCreated());
        updatePromo.setUpdated(promo.getUpdated());
        return promoRepository.save(updatePromo);
    }

    @Override
    public Map<String, Boolean> deletePromo(Integer id) {
        Promo updatePromo = promoRepository.findById(id).get();
        promoRepository.delete(updatePromo);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}
