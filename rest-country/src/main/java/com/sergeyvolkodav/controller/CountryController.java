package com.sergeyvolkodav.controller;

import com.sergeyvolkodav.domain.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CountryController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Country listCountry() {
        Map<String, String> env = System.getenv();
        return new Country(env.get("country"));
    }
}
