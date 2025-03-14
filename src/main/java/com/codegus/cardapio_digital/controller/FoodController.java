package com.codegus.cardapio_digital.controller;

import com.codegus.cardapio_digital.food.Food;
import com.codegus.cardapio_digital.food.FoodRepository;
import com.codegus.cardapio_digital.food.FoodRequestDTO;
import com.codegus.cardapio_digital.food.FoodResposneDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodRepository repository;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResposneDTO> showFood(){
        List<FoodResposneDTO> foodList = repository.findAll().stream().map(FoodResposneDTO::new).toList();
        return foodList;
    }
}
