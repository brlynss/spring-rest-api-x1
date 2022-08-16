/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "company")
public class Company {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id")
    private String Id;
    @Column(name = "logo")
    private String logo;
    @Column(name = "name")
    private String name;
    @Column(name = "director")
    private String director;
    @Column(name = "phone")
    private String phone;
    @Column(name = "number_of_buses")
    private int numberOfBuses;
    @Column(name = "total_passenger")
    private int totalPassenger;
    @Column(name = "reting_id")
    private int retingId;
    @Column(name = "address")
    private String address;
    @Column(name = "blocked")
    private Boolean blocked;
    @Column(name = "admin_id")
    private String adminId;
    @Column(name = "created")
    @CreationTimestamp
    private Date created;
    @Column(name = "updated")
    @UpdateTimestamp
    private Date updated;

    public Company() {
    }

    public Company(String Id, String logo, String name, String director, String phone, int numberOfBuses, int totalPassenger, int retingId, String address, Boolean blocked, String adminId, Date created, Date updated) {
        this.Id = Id;
        this.logo = logo;
        this.name = name;
        this.director = director;
        this.phone = phone;
        this.numberOfBuses = numberOfBuses;
        this.totalPassenger = totalPassenger;
        this.retingId = retingId;
        this.address = address;
        this.blocked = blocked;
        this.adminId = adminId;
        this.created = created;
        this.updated = updated;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumberOfBuses() {
        return numberOfBuses;
    }

    public void setNumberOfBuses(int numberOfBuses) {
        this.numberOfBuses = numberOfBuses;
    }

    public int getTotalPassenger() {
        return totalPassenger;
    }

    public void setTotalPassenger(int totalPassenger) {
        this.totalPassenger = totalPassenger;
    }

    public int getRetingId() {
        return retingId;
    }

    public void setRetingId(int retingId) {
        this.retingId = retingId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
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
