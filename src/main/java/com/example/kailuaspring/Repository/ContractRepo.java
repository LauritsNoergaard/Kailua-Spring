package com.example.kailuaspring.Repository;



import com.example.kailuaspring.Model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public List<Contract> fetchContracts(String driverLCSNum) {
        String sql = ("SELECT * FROM kailua.contract WHERE driver_license_number = ?");
        RowMapper<Contract> rowMapper = new BeanPropertyRowMapper<>(Contract.class);
        List<Contract> contracts = template.query(sql, rowMapper, driverLCSNum);
        return contracts;
    }


}
