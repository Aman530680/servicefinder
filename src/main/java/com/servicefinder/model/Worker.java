package com.servicefinder.model;

import jakarta.persistence.*;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String serviceType;
    private String location;
    private String phone;
    private double rating;

    public Worker() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public double getRating() {
        return rating;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}