package bootcamp.edu.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IndexController {

    public IndexController(){

    }

    @RequestMapping("/")
    public String index(){
        return "Welcome, BootCamp 1.0";
    }

    @RequestMapping("/watch")
    public String watch(){
        return "Unlocking Your Coding Powers: Day 20 of Code Hero Journey";
    }
    
}
