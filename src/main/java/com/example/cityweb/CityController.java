package com.example.cityweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class CityController {

    @GetMapping("/cities/{id}")
    public String getCityById(@PathVariable int id) {
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Paris", "Sydney");
        if (id >= 0 && id < cities.size()) {
            return cities.get(id);
        } else {
            return "City not found";
        }
    }

}


