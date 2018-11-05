package com.example.laki.app.springbootact;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {

    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "Laki Say Hello";
    }

    @GetMapping("/welcome")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }

    @GetMapping("/showPad")
    public String showPad(final Model model){
        return "noconflict";
    }
}
