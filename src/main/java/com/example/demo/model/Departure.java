/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "departure")
public class Departure {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;
    @Column(name = "price")
    private float price;
    @Column(name = "description")
    private String description;
    @Column(name = "total_window")
    private int totalWindow;
    @Column(name = "start_destination")
    private int startDestination;
    @Column(name = "end_destination")
    private int endDestination;
    @Column(name = "start_location")
    private String startLocation;
    @Column(name = "end_location")
    private String endLocation;
    @Column(name = "passenger_limit")
    private int passengerLimit;
    @Column(name = "passenger_total")
    private int passengerTotal;
    @Column(name = "payment_type_list")
    private String paymentTypeList;
    @Column(name = "facility_list")
    private String facilityList;
    @Column(name = "start_hours_of_departure")
    private Date startHoursOfDeparture;
    @Column(name = "end_hours_of_departure")
    private Date endHoursOfDeparture;
    @Column(name = "traveling_time_hours")
    private int travelingTimeHours;
    @Column(name = "traveling_time_minute")
    private int travelingTimeMinute;
    @Column(name = "promo_id")
    private String promoId;
    @Column(name = "company_id")
    private String companyId;
    @Column(name = "departure_status_id")
    private int departureStatusId;
    @Column(name = "created")
    private Date created;
    @Column(name = "updated")
    private Date updated;

    public Departure() {
    }

    public Departure(String id, float price, String description, int totalWindow, int startDestination, int endDestination, String startLocation, String endLocation, int passengerLimit, int passengerTotal, String paymentTypeList, String facilityList, Date startHoursOfDeparture, Date endHoursOfDeparture, int travelingTimeHours, int travelingTimeMinute, String promoId, String companyId, int departureStatusId, Date created, Date updated) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.totalWindow = totalWindow;
        this.startDestination = startDestination;
        this.endDestination = endDestination;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.passengerLimit = passengerLimit;
        this.passengerTotal = passengerTotal;
        this.paymentTypeList = paymentTypeList;
        this.facilityList = facilityList;
        this.startHoursOfDeparture = startHoursOfDeparture;
        this.endHoursOfDeparture = endHoursOfDeparture;
        this.travelingTimeHours = travelingTimeHours;
        this.travelingTimeMinute = travelingTimeMinute;
        this.promoId = promoId;
        this.companyId = companyId;
        this.departureStatusId = departureStatusId;
        this.created = created;
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalWindow() {
        return totalWindow;
    }

    public void setTotalWindow(int totalWindow) {
        this.totalWindow = totalWindow;
    }

    public int getStartDestination() {
        return startDestination;
    }

    public void setStartDestination(int startDestination) {
        this.startDestination = startDestination;
    }

    public int getEndDestination() {
        return endDestination;
    }

    public void setEndDestination(int endDestination) {
        this.endDestination = endDestination;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public int getPassengerLimit() {
        return passengerLimit;
    }

    public void setPassengerLimit(int passengerLimit) {
        this.passengerLimit = passengerLimit;
    }

    public int getPassengerTotal() {
        return passengerTotal;
    }

    public void setPassengerTotal(int passengerTotal) {
        this.passengerTotal = passengerTotal;
    }

    public String getPaymentTypeList() {
        return paymentTypeList;
    }

    public void setPaymentTypeList(String paymentTypeList) {
        this.paymentTypeList = paymentTypeList;
    }

    public String getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(String facilityList) {
        this.facilityList = facilityList;
    }

    public Date getStartHoursOfDeparture() {
        return startHoursOfDeparture;
    }

    public void setStartHoursOfDeparture(Date startHoursOfDeparture) {
        this.startHoursOfDeparture = startHoursOfDeparture;
    }

    public Date getEndHoursOfDeparture() {
        return endHoursOfDeparture;
    }

    public void setEndHoursOfDeparture(Date endHoursOfDeparture) {
        this.endHoursOfDeparture = endHoursOfDeparture;
    }

    public int getTravelingTimeHours() {
        return travelingTimeHours;
    }

    public void setTravelingTimeHours(int travelingTimeHours) {
        this.travelingTimeHours = travelingTimeHours;
    }

    public int getTravelingTimeMinute() {
        return travelingTimeMinute;
    }

    public void setTravelingTimeMinute(int travelingTimeMinute) {
        this.travelingTimeMinute = travelingTimeMinute;
    }

    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public int getDepartureStatusId() {
        return departureStatusId;
    }

    public void setDepartureStatusId(int departureStatusId) {
        this.departureStatusId = departureStatusId;
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
