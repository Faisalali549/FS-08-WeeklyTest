package com.example.restaurantModel.controller;

import com.example.restaurantModel.model.Restaurant;
import com.example.restaurantModel.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping
    public void addRestaurant(@RequestBody Restaurant restaurant) {

    }

    @GetMapping("/find-restaurant/id/{id}")
    public Restaurant findRestaurantByID(@PathVariable int id) {
        return restaurantService.findById(id);
    }

    @GetMapping("find-all")
    public List<Restaurant> findAllRestaurants() {
        return restaurantService.findAll();
    }


}
