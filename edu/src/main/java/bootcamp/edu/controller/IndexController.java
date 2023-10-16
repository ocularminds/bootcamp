package bootcamp.edu.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController 
//SUCCESS(200), CREATED(201), ERROR(500), NOT_FOUND(404), BUSY(...), MOVED(301) 
// (MVC Model-View-Controller)
public class IndexController {

    public IndexController(){

    }

    @RequestMapping("/")
    public String index(){
        return "Welcome, BootCamp 1.0";
    }

    @RequestMapping("/watch")
    public String watch(){
        return "Unlocking Your Coding Powers: Demystifying SpringBoot";
    }
    
}
