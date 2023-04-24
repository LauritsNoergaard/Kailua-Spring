package com.example.kailuaspring.Repository;

import com.example.kailuaspring.Model.Renter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RenterRepo {

    @Autowired
    JdbcTemplate template;

    public boolean create(Renter renter) {
        String sql = "INSERT INTO renter (driver_license_number, name, address, zip, city, phone, email" +
                "VALUES(?, ?, ?, ?, ?, ?))";
        template.update(sql, renter.getDriverLicenseNumber(), renter.getName(), renter.getAddress(), renter.getZip(),
                renter.getCity(), renter.getPhone(), renter.getEmail());
        return true;
    }
}
