package com.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ketkeemaknikar on 6/22/16.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
