package com.valueup.veryveryhot.Repository;

import com.valueup.veryveryhot.Model.Cross;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CrossRepository extends MongoRepository<Cross, String> {
    
    public Cross findByScore(int score);
    public Cross findByCategory(String category);
    
}