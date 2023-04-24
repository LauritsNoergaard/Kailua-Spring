package com.example.kailuaspring.Controller;

import com.example.kailuaspring.Model.Car;
import com.example.kailuaspring.Model.Renter;
import com.example.kailuaspring.Service.CarService;
import com.example.kailuaspring.Service.ContractService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CarService carService;

    @Autowired
    ContractService contractService;

    @GetMapping("/")
    public String index() {
        return "home/index";
    }
    @GetMapping("/logIn")
    public String logIn(){
        return "home/loginPage";
    }
    @GetMapping("/register")
    public String register(){
        return "home/registerUser";
    }
    @PostMapping("/createRenter")
    public String createRenter(){

        return "home/index";
    }

    @PostMapping("/viewAvailableCars")
    public String viewAvailableCars(WebRequest wr, Model model){
        String fromDate = wr.getParameter("rentCarFrom");
        String toDate = wr.getParameter("rentCarTo");
        String carType = wr.getParameter("carType");

        System.out.println(fromDate);
        System.out.println(toDate);
        System.out.println(carType);


        List<Car> cars = carService.fetchAvailableCars(fromDate, toDate, carType);
        model.addAttribute("cars", cars);
        System.out.println(cars);
        return "home/rentCar";
    }

    @GetMapping("/rentCar/{registration_number}")
    public String rentCar(WebRequest wr, HttpSession session,
                          @PathVariable ("registration_number") String registration_number){
        String fromDate = wr.getParameter("rentCarFrom");
        String toDate = wr.getParameter("rentCarTo");

        Renter renter = (Renter) session.getAttribute("renter");//TODO TEMP

        Car car = carService.fetchCar(registration_number);

        contractService.rentCar(fromDate, toDate, renter.getDriverLicenseNumber(),registration_number, car.getOdometer());


        return "home/index";
    }


}
