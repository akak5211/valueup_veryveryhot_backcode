package com.valueup.veryveryhot.Repository;

import com.valueup.veryveryhot.Model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
    public Payment findByCategory(String category);
    public Payment findByShopname(String shopname);

}
