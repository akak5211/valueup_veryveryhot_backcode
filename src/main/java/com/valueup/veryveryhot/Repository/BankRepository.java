package com.valueup.veryveryhot.Repository;

import com.valueup.veryveryhot.Model.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankRepository extends MongoRepository<Bank, String> {
    
    public Bank findByParentid(String parentid);

    
}
