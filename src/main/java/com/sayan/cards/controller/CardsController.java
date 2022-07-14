package com.sayan.cards.controller;

import com.sayan.cards.model.Cards;
import com.sayan.cards.model.Customer;
import com.sayan.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("/myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer){

        Optional<List<Cards>> optCards = Optional.of(cardsRepository.findByCustomerId(customer.getCustomerId()));

        return optCards.orElse(null);
    }

}
