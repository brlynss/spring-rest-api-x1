/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "company_employe")
public class CompanyEmploye {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "company_id")
    private String companyId;
    @Column(name = "employe_id")
    private String employeId;
    @Column(name = "work")
    private Boolean work;
    @Column(name = "latitude")
    private String latitude;
    @Column(name ="longitude")
    private String longitude;
    @Column(name = "created")
    private Date created;
    @Column(name = "updated")
    private Date updated;

    public CompanyEmploye() {
    }

    public CompanyEmploye(int id, String companyId, String employeId, Boolean work, String latitude, String longitude, Date created, Date updated) {
        this.id = id;
        this.companyId = companyId;
        this.employeId = employeId;
        this.work = work;
        this.latitude = latitude;
        this.longitude = longitude;
        this.created = created;
        this.updated = updated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getEmployeId() {
        return employeId;
    }

    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }

    public Boolean getWork() {
        return work;
    }

    public void setWork(Boolean work) {
        this.work = work;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    
    
}
