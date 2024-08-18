package br.com.ceciliasimoes.CardapioWeb.controller;

import br.com.ceciliasimoes.CardapioWeb.dtos.FoodCreateDTO;
import br.com.ceciliasimoes.CardapioWeb.dtos.FoodDTO;
import br.com.ceciliasimoes.CardapioWeb.model.Food;
import br.com.ceciliasimoes.CardapioWeb.repository.ICardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

    @Autowired
    private ICardapioRepository cardapioRepository;

    @GetMapping
    public ResponseEntity<List<FoodDTO>> getAllFoods(){
        List<FoodDTO> foodList = this.cardapioRepository.findAll().stream().map(FoodDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(foodList);
    }

    @PostMapping
    public ResponseEntity saveFood(@RequestBody FoodCreateDTO dto){
        Food food = new Food(
                dto.title(),
                dto.image(),
                Double.parseDouble(dto.price().toString().replace(",", "."))
        );
        this.cardapioRepository.save(food);
        return ResponseEntity.ok().build();
    }

}
