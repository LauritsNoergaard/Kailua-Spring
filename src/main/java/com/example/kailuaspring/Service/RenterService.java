package com.example.kailuaspring.Service;

import com.example.kailuaspring.Model.Renter;
import com.example.kailuaspring.Repository.RenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class RenterService {
@Autowired
    RenterRepo renterRepo;

    public boolean createNewRenter(Renter renter){
        return renterRepo.create(renter);
    }
    public boolean login(Renter renter) {
        return renterRepo.login(renter);
    }
    public Renter setLoggedInUser(Renter renter){
        return renterRepo.setLoggedInUser(renter);
    }
}
