package com.valueup.veryveryhot.Repository;

import java.util.List;

import com.valueup.veryveryhot.Model.Cross;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CrossRepository extends MongoRepository<Cross, String> {
    
    public Cross findByCrossurl(String crossurl);
    public Cross findByImgurl(String imgurl);
    
}