/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.response;

import com.example.demo.model.Promo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



/**
 *
 * @author LENOVO
 */
public class CommonResponseGenerator {
    public static <T> CommonResponse<T> successResponse(T data) {
        CommonResponse<T> response = new CommonResponse<>();
        response.setStatus(String.valueOf(HttpStatus.OK.value()));
        response.setMessage(HttpStatus.OK.name());
        response.setData(data);
        return response;
    }

    public static <T> CommonResponse<T> errorResponse(String errors, int status, String message) {
        CommonResponse<T> response = new CommonResponse<>();
        response.setStatus(String.valueOf(status));
        response.setMessage(message);
        response.setData((T) errors);
        return response;
    }


    
}
