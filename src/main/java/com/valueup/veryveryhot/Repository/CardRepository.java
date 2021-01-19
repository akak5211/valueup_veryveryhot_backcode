package com.valueup.veryveryhot.Repository;

import com.valueup.veryveryhot.Model.Card;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card, String> {
    public Card findByCardcompany(String cardcompany);
    public Card findByCardcategory(String cardcategory);
    
}
