package poc.spring.arm.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/news")
public class NewController {

    @GetMapping("/top10news")
    public String getTop10News() {
        return "here are top 10 news";
    }
}
