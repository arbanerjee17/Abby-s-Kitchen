package com.restaurant.controller;

import com.restaurant.entity.Food;
import com.restaurant.repository.FoodRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
@CrossOrigin
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping("/all")
    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }

    @PostMapping("/add")
    public Food addFood(@RequestBody Food food) {
        return foodRepository.save(food);
    }

    @PutMapping("/update/{id}")
    public Food updateFood(@PathVariable Long id, @RequestBody Food updatedFood) {

    Food food = foodRepository.findById(id).orElseThrow();

    food.setName(updatedFood.getName());
    food.setPrice(updatedFood.getPrice());
    food.setImageUrl(updatedFood.getImageUrl());
    food.setIcon(updatedFood.getIcon());

    return foodRepository.save(food);
}

}
