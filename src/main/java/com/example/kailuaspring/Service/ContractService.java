package com.example.kailuaspring.Service;

import com.example.kailuaspring.Model.Contract;
import com.example.kailuaspring.Repository.ContractRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {

    @Autowired
    ContractRepo contractRepo;

    public void rentCar(String fromDate, String toDate, String driverLCSNum, String regnum, int odo) {
        contractRepo.rentCar(fromDate,toDate,driverLCSNum,regnum,odo);
    }

    public List<Contract> fetchContracts(String driverLCSnum) {
        return contractRepo.fetchContracts(driverLCSnum);
    }

}
