package com.valueup.veryveryhot.Repository;

import com.valueup.veryveryhot.Model.Edu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EduRepository extends MongoRepository<Edu, String> {
    
    public Edu findByEduname(String eduname);
    public Edu findByEduurl(String eduurl);
    public Edu findByEduage(String eduage);

    
}