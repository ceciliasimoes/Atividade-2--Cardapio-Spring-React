package br.com.ceciliasimoes.CardapioWeb.dtos;

import br.com.ceciliasimoes.CardapioWeb.model.Food;

public record FoodDTO(
        Long id,
        String title,
        String image,
        Double price
) {
    public FoodDTO(Food food) {
        this(
                food.getId(),
                food.getTitle(),
                food.getImage(),
                food.getPrice()
        );
    }
}
