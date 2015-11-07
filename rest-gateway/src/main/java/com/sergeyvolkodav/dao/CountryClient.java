package com.sergeyvolkodav.dao;

import com.sergeyvolkodav.domain.Country;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("COUNTRY")
public interface CountryClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    Country getCountry();
}
