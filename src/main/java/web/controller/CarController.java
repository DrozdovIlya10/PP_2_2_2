package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> messages = new ArrayList<>();
        messages.add(new Car((long)1,"car1",100));
        messages.add(new Car((long)2,"car2",200));
        messages.add(new Car((long)3,"car3",300));
        messages.add(new Car((long)4,"car4",400));
        messages.add(new Car((long)5,"car5",500));
        messages = CarServiceImp.getCars(messages,allCars);
        model.addAttribute("messages", messages);
        return "cars";
    }
}
