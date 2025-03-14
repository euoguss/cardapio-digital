package com.codegus.cardapio_digital.food;

public record FoodResposneDTO(Long id, String title, String image, double price) {
    public FoodResposneDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
