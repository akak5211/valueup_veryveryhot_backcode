package com.valueup.veryveryhot.Repository;

import com.valueup.veryveryhot.Model.Knowledge;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface KnowledgeRepository extends MongoRepository<Knowledge, String> {
    
}
