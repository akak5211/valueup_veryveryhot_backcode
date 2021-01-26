package com.valueup.veryveryhot.Repository;

import java.util.List;

import com.valueup.veryveryhot.Model.Edu;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EduRepository extends MongoRepository<Edu, String> {
    
    public Edu findByEduname(String eduname);
    public Edu findByEduurl(String eduurl);
    public Edu findByEduage(String eduage);
    public Edu findByEduimgurl(String eduimgurl);
    public List<Edu> findByEducategory(String educategory);
    
}