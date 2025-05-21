package se.distansakademin.rest_ez;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    // http://localhost:8080/hello

    @GetMapping("/hello")
    public String getHello(){
        return "Hello my friend";
    }


    @GetMapping("/goodbye")
    public String getGoodbye(){
        return "Good bye my friend";
    }
}
