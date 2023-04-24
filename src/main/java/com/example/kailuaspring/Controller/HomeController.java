package com.example.kailuaspring.Controller;

import com.example.kailuaspring.Model.Car;
import com.example.kailuaspring.Model.Renter;
import com.example.kailuaspring.Service.CarService;
import com.example.kailuaspring.Service.RenterService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CarService carService;
    @Autowired
    RenterService renterService;

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
}
