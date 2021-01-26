package com.valueup.veryveryhot.Repository;

import java.util.List;

import com.valueup.veryveryhot.Model.Payment;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
    public List<Payment> findByCategory(String category);
    public List<Payment> findByShopname(String shopname);
    public List<Payment> findByParentid(int parentid);

}
