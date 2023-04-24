package com.example.kailuaspring.Service;

import com.example.kailuaspring.Model.Car;
import com.example.kailuaspring.Repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepo carRepo;

    public List<Car> fetchAvailableCars(String fromDate, String toDate, String carType) {
        return carRepo.fetchAvailableCars(fromDate, toDate, carType);
    }
}
