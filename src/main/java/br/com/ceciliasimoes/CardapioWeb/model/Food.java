package br.com.ceciliasimoes.CardapioWeb.model;

import br.com.ceciliasimoes.CardapioWeb.dtos.FoodCreateDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "foods")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Double price;

    public Food(String title, String image, double price) {
        this.title = title;
        this.price = price;
        this.image = image;
    }
}
