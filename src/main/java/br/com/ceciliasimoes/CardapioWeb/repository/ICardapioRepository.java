package br.com.ceciliasimoes.CardapioWeb.repository;

import br.com.ceciliasimoes.CardapioWeb.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICardapioRepository extends JpaRepository<Food,Long> {
}
