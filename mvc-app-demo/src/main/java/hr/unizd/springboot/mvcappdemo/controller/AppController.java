package hr.unizd.springboot.mvcappdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/app")
    public String hello(Model model) {
        model.addAttribute("name", "Moja prva app");
        return "app";


    }

}
