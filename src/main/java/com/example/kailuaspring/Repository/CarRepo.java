package com.example.kailuaspring.Repository;

import com.example.kailuaspring.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepo {

    @Autowired
    JdbcTemplate template;
    public List<Car> fetchAvailableCars (String from_date, String to_date, String carType){ //Should type be ENUM??
        String sql = "SELECT * FROM car" +
                " INNER JOIN contract ON car.registration_number = contract.registration_number" +
                " WHERE from_date_time > ? OR to_date_time < ? AND rental_type = ?";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);
        List<Car> cars = template.query(sql, rowMapper, to_date, from_date, carType);
        return cars;
    }
}
