package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    @GetMapping(path = "/")
    @ResponseBody
    public String index (){
        return "This is the landing page!";
    }

}
