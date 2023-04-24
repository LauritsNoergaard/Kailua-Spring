package com.example.kailuaspring.Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContractRepo {

    @Autowired
    JdbcTemplate template;

    public void rentCar(String fromDate, String toDate, String driverLCSNum, String regnum, int odo){
        String sql = "INSERT INTO kailua.contract (contract_id, from_date_time, driver_license_number, " +
                "registration_number, to_date_time, odometer_at_start) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        template.update(sql, null, fromDate, driverLCSNum, regnum,toDate,odo);
    }


}
