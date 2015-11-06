package com.sergeyvolkodav.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CountryController {

    @RequestMapping("/")
    public @ResponseBody
    String getWord() {
        Map<String, String> env = System.getenv();
        return String.format("Hi from %s", env.get("country"));
    }

}
