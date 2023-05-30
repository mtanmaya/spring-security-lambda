package poc.spring.arm.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

    @GetMapping("/")
    public String home() {
        return "welcome to the Spring Security";
    }
}
