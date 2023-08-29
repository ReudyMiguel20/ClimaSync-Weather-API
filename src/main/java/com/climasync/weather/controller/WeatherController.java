package com.climasync.weather.controller;

import com.climasync.weather.model.entity.Location;
import com.climasync.weather.service.CachedWeatherService;
import com.climasync.weather.service.CurrentWeatherService;
import com.climasync.weather.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/weather")
public class WeatherController {

    private final CurrentWeatherService currentWeatherService;
    private final LocationService locationService;
    private final CachedWeatherService cachedWeatherService;
    private final ModelMapper modelMapper;

    /**
     * @param place   -- Location name (city, state) to search for
     * @param country -- Country code (e.g. "US") to search for
     * @return
     */
    @GetMapping("/current")
    public ResponseEntity<?> getCurrentWeatherByPlaceAndCountry(@RequestParam(name = "q") String place, @RequestParam(name = "country") String country) {
        Location location = locationService.getLocationByPlaceAndCountry(place, country);

        return ResponseEntity.ok("okay");
    }

}
