package com.sergeyvolkodav.controller;


import com.sergeyvolkodav.dao.CountryClient;
import com.sergeyvolkodav.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceController {

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private CountryClient icountryClient;
    private final String country = "country";

    @RequestMapping("/country")
    public Country getCountry() {
         return icountryClient.getCountry();
    }
}
