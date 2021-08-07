package restweb.springbootrestapi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageRestController {

    @GetMapping("/homepage")
    public String homePage(){
        return "homepage";
    }

}
