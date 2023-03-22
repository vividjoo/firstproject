package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class FirstController {

    @GetMapping("/hi")
    public String nice(Model model) {
        model.addAttribute("username", "안녕zz");
        return "greetings";
    }

    @GetMapping("/bye")
    public String bye(Model model) {
        model.addAttribute("bye", "수고 하셨습니다");
        return "bye";
    }


}
