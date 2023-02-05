package com.example.restaurantModel.service;

import com.example.restaurantModel.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurantService {
    private static final List<Restaurant> restaurants = new ArrayList<>();
    private static int restaurantId;

    static {
        restaurants.add(new Restaurant("Food Palace", "Ward-12, near Hotel Kailash, Gopalganj", "Fast-Food", 9999999999L, 15, restaurantId++));
        restaurants.add(new Restaurant("Hot & Cool Dehati Cafe", "Sant More Inderwan Rafi, Gopalganj", "Cafe", 9999999999L, 11, restaurantId++));
        restaurants.add(new Restaurant("Mishra Famaly", "FCMP+6JP, villg- Tiwary Matihiniya, Gopalganj", "Fast-Food", 9999999999L, 17, restaurantId++));
        restaurants.add(new Restaurant("The Food Plaza", "Sadhu Market, Yadavpur Rd, near Kailash Hotel, Gopalganj", "Family-Restaurant", 9999999999L, 21, restaurantId++));
        restaurants.add(new Restaurant("Food Cart", "Yadavpur Rd, Ward Number 3, Gopalganj", "Sweets", 9999999999L, 18, restaurantId++));
    }

    public List<Restaurant> findAll() {
        return restaurants;
    }

    public Restaurant findById(int id) {
        Predicate<? super Restaurant> predicate =restaurant -> restaurant.getId() == id;

        Restaurant restaurant =restaurants.stream().filter(predicate).findFirst().get();
        return restaurant;
    }
}
