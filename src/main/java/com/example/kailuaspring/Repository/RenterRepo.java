package com.example.kailuaspring.Repository;

import com.example.kailuaspring.Model.Renter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RenterRepo {

    @Autowired
    JdbcTemplate template;

    public boolean create(Renter renter) {
        String sql = "INSERT INTO renter (driver_license_number, name, address, zip, city, phone, email, password)" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, renter.getDriverLicenseNumber(), renter.getName(), renter.getAddress(), renter.getZip(),
                renter.getCity(), renter.getPhone(), renter.getEmail(), renter.getPassword());
        return true;
    }
    public boolean login(Renter renter) {
        String sql = "SELECT * FROM kailua.renter WHERE email = ? AND password = ?";
        RowMapper<Renter> rm = new BeanPropertyRowMapper<>(Renter.class);
        try{
            Renter r = template.queryForObject(sql, rm, renter.getEmail(), renter.getPassword());
            return true;
        } catch (EmptyResultDataAccessException e) {
            return false;
        }
    }
}
