package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    @GetMapping(path = "/")
    @ResponseBody
    public String index (){
        return "This is the landing page!";
    }

    @GetMapping("/roll-dice")
    public String rolldice (){
        return "rolldice";
    }

    @PostMapping("/roll-dice")
    public String dicerolled(Model model) {
        int userRoll = (int)Math.floor(Math.random()*(6-1+1)+1);
        int cpuRoll = (int)Math.floor(Math.random()*(6-1+1)+1);
        model.addAttribute("userRoll", "You rolled : " + userRoll + ".");
        model.addAttribute("cpuRoll", "CPU rolled: " + cpuRoll + ".");
        if (userRoll == cpuRoll) {
            model.addAttribute("result","Radical, you won!"
            );
        } else {
            model.addAttribute("result", "Dang, try again...");
        }
        return "rolldice";
    }



}
