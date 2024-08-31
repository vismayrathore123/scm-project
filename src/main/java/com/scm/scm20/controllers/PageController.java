package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
public String home(Model model){
    System.out.println("Home Page Handler");
    model.addAttribute("name","substring technologies");
    model.addAttribute("Evision_software_solution", "vismay rathore");
    model.addAttribute("githubLink","https://github.com/vismayrathore123");
    

    model.addAttribute("github", "repo");
    return "home";
}
}
