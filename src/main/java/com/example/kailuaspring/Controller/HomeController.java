package com.example.kailuaspring.Controller;

import com.example.kailuaspring.Model.Car;
import com.example.kailuaspring.Model.Renter;
import com.example.kailuaspring.Service.CarService;
import com.example.kailuaspring.Service.RenterService;
import com.example.kailuaspring.Service.ContractService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CarService carService;
    @Autowired
    RenterService renterService;

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
    public String createRenter(@ModelAttribute Renter renter, HttpSession session){
        renterService.createNewRenter(renter);
        session.setAttribute("renter", renter);
        System.out.println(session.getAttribute("renter"));
        return "home/index";
    }
    @PostMapping("/loginUser")
    public String logInUser(@ModelAttribute Renter renter, HttpSession session){
        //TODO HVIS LOGIN FRA USER PASSER MED DB, SÅ SET SESSION
        return "home/index";
    }

    @PostMapping("/viewAvailableCars")
    public String viewAvailableCars(WebRequest wr, Model model, HttpSession session){
        String fromDate = wr.getParameter("rentCarFrom");
        String toDate = wr.getParameter("rentCarTo");
        String carType = wr.getParameter("carType");

        session.setAttribute("fromDate", fromDate);
        session.setAttribute("toDate", toDate);


        List<Car> cars = carService.fetchAvailableCars(fromDate, toDate, carType);
        model.addAttribute("cars", cars);
        if(cars.size()>0){
            System.out.println(cars.get(0).getRegistration_date());

        }

        return "home/rentCar";
    }

    @GetMapping("/rentCar/{registration_number}")
    public String rentCar(HttpSession session,
                          @PathVariable ("registration_number") String registration_number){

        String fromDate = (String) session.getAttribute("fromDate");
        String toDate = (String) session.getAttribute("toDate");

        Renter renter = (Renter) session.getAttribute("renter");//TODO TEMP

        Car car = carService.fetchCar(registration_number);

        contractService.rentCar(fromDate, toDate, renter.getDriverLicenseNumber(),registration_number, car.getOdometer());



        return "redirect:/";
    }


}
