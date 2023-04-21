package com.example.kailuaspring.Model;

public class Contract {
    private String contractID;
    private String fromDateTime;
    private String toDateTime;
    private String driverLicenseNumber;
    private String registrationNumber;
    private int odometerAtStart;

    public Contract(String contractID, String fromDateTime, String toDateTime, String driverLicenseNumber, String registrationNumber, int odometerAtStart) {
        this.contractID = contractID;
        this.fromDateTime = fromDateTime;
        this.toDateTime = toDateTime;
        this.driverLicenseNumber = driverLicenseNumber;
        this.registrationNumber = registrationNumber;
        this.odometerAtStart = odometerAtStart;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getFromDateTime() {
        return fromDateTime;
    }

    public void setFromDateTime(String fromDateTime) {
        this.fromDateTime = fromDateTime;
    }

    public String getToDateTime() {
        return toDateTime;
    }

    public void setToDateTime(String toDateTime) {
        this.toDateTime = toDateTime;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getOdometerAtStart() {
        return odometerAtStart;
    }

    public void setOdometerAtStart(int odometerAtStart) {
        this.odometerAtStart = odometerAtStart;
    }


}
