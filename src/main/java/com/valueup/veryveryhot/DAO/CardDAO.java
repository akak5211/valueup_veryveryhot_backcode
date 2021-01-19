package com.valueup.veryveryhot.DAO;

import java.util.List;

import com.valueup.veryveryhot.Model.Card;

public interface CardDAO {
    public List<Card> getAllCards();

    public Card getCardById(String id);

    public Card getCardByCardcompany(String cardcompany);

    public Card getCardByCardcategory(String cardcategory);

    public Card addCard(Card card);

    public Card updateCard(Card card);

    public void deleteCard(Card card);
    
}
