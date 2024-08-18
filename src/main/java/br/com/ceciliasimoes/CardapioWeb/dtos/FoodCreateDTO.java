package br.com.ceciliasimoes.CardapioWeb.dtos;

public record FoodCreateDTO(
        String title,
        String image,
        Double price
) {
}
