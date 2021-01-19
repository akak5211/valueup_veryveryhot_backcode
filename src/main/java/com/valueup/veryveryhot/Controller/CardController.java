package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.Card;
import com.valueup.veryveryhot.Service.CardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @Autowired
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("api/v1/card")
    public List<Card> getAll() {
        return cardService.getAllCards();
    }

    @GetMapping("api/v1/card/{id}")
    public Card getByID(@PathVariable("id") String id) {
        return cardService.getCard(id);
    }

    @GetMapping("api/v1/card/cardcompany/{cardcompany}")
    public Card getByCardcompany(@PathVariable("cardcompany") String cardcompany) {
        return cardService.getCardByCardcompany(cardcompany);
    }
    
    @GetMapping("api/v1/card/cardcategory/{cardcategory}")
    public Card getByCardcategory(@PathVariable("cardcategory") String cardcategory) {
        return cardService.getCardByCardcategory(cardcategory);
    }

    @PostMapping("api/v1/card/add")
    @ResponseStatus(value=HttpStatus.OK)
        public Card addCard(@RequestBody Card card){
        return cardService.addCard(card);
    }

    @DeleteMapping("api/v1/card/delete/{id}")
    public void removeCard(@PathVariable String id) {
        cardService.removeCard(id);
    }
}
