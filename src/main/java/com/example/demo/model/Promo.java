/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "promo")
public class Promo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;
    @Column(name = "image")
    private String image;
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
    @Column(name = "expired_date")
    private Date expiredDate;
    @Column(name = "max_use")
    private int maxUse;
    @Column(name = "used")
    private int used;
    @Column(name = "all_company")
    private Boolean allCompany;
    @Column(name = "company_id")
    private String companyId;
    @Column(name = "created")
    @CreationTimestamp
    private Date created;
    @Column(name = "updated")
    @UpdateTimestamp
    private Date updated;

    public Promo() {
    }

    public Promo(int Id, String image, String code, String description, Date expiredDate, int maxUse, int used, Boolean allCompany, String companyId, Date created, Date updated) {
        this.Id = Id;
        this.image = image;
        this.code = code;
        this.description = description;
        this.expiredDate = expiredDate;
        this.maxUse = maxUse;
        this.used = used;
        this.allCompany = allCompany;
        this.companyId = companyId;
        this.created = created;
        this.updated = updated;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public int getMaxUse() {
        return maxUse;
    }

    public void setMaxUse(int maxUse) {
        this.maxUse = maxUse;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public Boolean getAllCompany() {
        return allCompany;
    }

    public void setAllCompany(Boolean allCompany) {
        this.allCompany = allCompany;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
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
