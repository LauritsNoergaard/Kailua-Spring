package com.example.kailuaspring.Model;

public class Renter {
    private String driverLicenseNumber;
    private String name;
    private String address;
    private String zip;
    private String city;
    private String phone;
    private String email;
    private String password;

    public Renter(String driverLicenseNumber, String name, String address, String zip, String city, String phone,
                  String email, String password) {
        this.driverLicenseNumber = driverLicenseNumber;
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
