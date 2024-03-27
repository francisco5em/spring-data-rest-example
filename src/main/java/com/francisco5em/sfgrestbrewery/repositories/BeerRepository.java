package com.francisco5em.sfgrestbrewery.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.francisco5em.sfgrestbrewery.domain.Beer;
import com.francisco5em.sfgrestbrewery.domain.BeerStyleEnum;

import java.util.UUID;


/**
 * Creado por Francisco E.
 */
public interface BeerRepository extends JpaRepository<Beer, UUID> {
    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);

    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pageable);

    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pageable);

    Beer findByUpc(String upc);
}
