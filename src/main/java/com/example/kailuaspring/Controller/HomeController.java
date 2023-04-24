package com.example.kailuaspring.Controller;

import com.example.kailuaspring.Model.Car;
import com.example.kailuaspring.Service.CarService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CarService carService;

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

    @PostMapping("/viewAvailableCars")
    public String viewAvailableCars(WebRequest wr, Model model){
        String fromDate = wr.getParameter("rentCarFrom");
        String toDate = wr.getParameter("rentCarTo");
        String carType = wr.getParameter("carType");

        List<Car> lists = carService.fetchAvailableCars(fromDate, toDate, carType);
        model.addAttribute("lists", lists);
        System.out.println(fromDate);
        System.out.println(toDate);
        System.out.println(carType);
        return "home/rentCar";
    }
    @GetMapping("/registerUserButton")
    public String registerUser(){
        return "home/registerUser";
    }
    @PostMapping("/createRenter")
    public String createRenter(){

        return "home/index";
    }

    /*@GetMapping("/registerUserButton")
    public String registerUser(){
        return "home/registerUser";
    }
    @PostMapping("/createRenter")
    public String createRenter(){

        return "home/index";
    }*/
}
