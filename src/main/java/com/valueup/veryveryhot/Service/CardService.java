package com.valueup.veryveryhot.Service;

import java.util.List;

import com.valueup.veryveryhot.DAO.CardDAOImpl;
import com.valueup.veryveryhot.Model.Card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    
    private final CardDAOImpl cardDAO;

    @Autowired
    public CardService(CardDAOImpl cardDAO) {
        this.cardDAO = cardDAO;
    }

    public List<Card> getAllCards(){
        return cardDAO.getAllCards();
    }

    public Card getCard(String id){
        return cardDAO.getCardById(id);
    }

    public Card getCardByCardcompany(String cardcompany){
        return cardDAO.getCardByCardcompany(cardcompany);
    }

    public Card getCardByCardcategory(String cardcategory){
        return cardDAO.getCardByCardcategory(cardcategory);
    }

    public Card addCard(Card card){
        return cardDAO.addCard(card);
    }

    public Card updateCard(Card card){
        return cardDAO.updateCard(card);
    }

    public void removeCard(String id){
        Card card = cardDAO.getCardById(id);
        cardDAO.deleteCard(card);
    }
    
}
