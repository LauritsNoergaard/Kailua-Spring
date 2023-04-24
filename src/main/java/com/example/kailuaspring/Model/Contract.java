package com.example.kailuaspring.Model;

public class Contract {
    private String contract_id;
    private String from_date_time;
    private String to_date_time;
    private String driver_license_number;
    private String registration_number;
    private int odometer_at_start;

    public Contract(String contract_id, String from_date_time, String to_date_time, String driverLicenseNumber, String registration_number, int odometer_at_start) {
        this.contract_id = contract_id;
        this.from_date_time = from_date_time;
        this.to_date_time = to_date_time;
        this.driver_license_number = driverLicenseNumber;
        this.registration_number = registration_number;
        this.odometer_at_start = odometer_at_start;
    }

    public String getContract_id() {
        return contract_id;
    }

    public void setContract_id(String contract_id) {
        this.contract_id = contract_id;
    }

    public String getFrom_date_time() {
        return from_date_time;
    }

    public void setFrom_date_time(String from_date_time) {
        this.from_date_time = from_date_time;
    }

    public String getTo_date_time() {
        return to_date_time;
    }

    public void setTo_date_time(String to_date_time) {
        this.to_date_time = to_date_time;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public int getOdometer_at_start() {
        return odometer_at_start;
    }

    public void setOdometer_at_start(int odometer_at_start) {
        this.odometer_at_start = odometer_at_start;
    }


}
