package com.valueup.veryveryhot.DAO;

import java.util.List;
import java.util.Optional;

import com.valueup.veryveryhot.Model.Card;
import com.valueup.veryveryhot.Repository.CardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CardDAOImpl implements CardDAO{

    @Autowired
    private final CardRepository CardRepository;


    public CardDAOImpl(CardRepository CardRepository){
        this.CardRepository = CardRepository;
    }

    @Override
    public List<Card> getAllCards() {
        return CardRepository.findAll();
    }

    @Override
    public Card getCardById(String id) {
        Optional<Card> Card = CardRepository.findById(id);
        return Card.get();
    }

    @Override
    public Card getCardByCardcompany(String cardcompany) {
        return CardRepository.findByCardcompany(cardcompany);
    }

    @Override
    public Card getCardByCardcategory(String cardcategory) {
        return CardRepository.findByCardcategory(cardcategory);
    }

    @Override
    public Card addCard(Card card) {
        return CardRepository.insert(card);
    }

    @Override
    public Card updateCard(Card newcard) {
        return CardRepository.save(newcard);
    }

    @Override
    public void deleteCard(Card card) {
       CardRepository.delete(card);
    }

}
