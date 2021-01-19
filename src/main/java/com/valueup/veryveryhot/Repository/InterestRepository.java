package com.valueup.veryveryhot.Repository;

import com.valueup.veryveryhot.Model.Interest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterestRepository extends MongoRepository<Interest, String> {
    public Interest findByParentid(String parentid);
    public Interest findByInterestname(String interestname);
    
}
