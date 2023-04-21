package com.example.kailuaspring.Model;

public class Car {
    private String registrationNumber;
    private String brand;
    private String model;
    private String fuelType;
    private int odometer;
    private String registrationDate;
    private Type type;

    public Car() {
    }

    public Car(String registrationNumber, String brand, String model, String fuelType, int odometer, String registrationDate, Type type) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.odometer = odometer;
        this.registrationDate = registrationDate;
        this.type = type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
