package com.example.kailuaspring.Model;

public class Car {
    private String registration_number;
    private String brand;
    private String model;
    private String fuel_type;
    private int odometer;
    private String registration_date;
    private Type type;

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
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

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Car(String registration_number, String brand, String model, String fuel_type, int odometer, String registration_date, Type type) {
        this.registration_number = registration_number;
        this.brand = brand;
        this.model = model;
        this.fuel_type = fuel_type;
        this.odometer = odometer;
        this.registration_date = registration_date;
        this.type = type;
    }

    public Car(){

    }


}
