package com.valueup.veryveryhot.DAO;

import java.util.List;
import java.util.Optional;

import com.valueup.veryveryhot.Model.Payment;
import com.valueup.veryveryhot.Repository.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDAOImpl implements PaymentDAO{
    
    @Autowired
    private final PaymentRepository PaymentRepository;

    public PaymentDAOImpl(PaymentRepository PaymentRepository) {
        this.PaymentRepository = PaymentRepository;
    }

    @Override
    public List<Payment> getAllPayments() {
        return PaymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(String id) {
        Optional<Payment> Payment = PaymentRepository.findById(id);
        return Payment.get();
    }

    @Override
    public List<Payment> getPaymentByCategory(String category) {
        return PaymentRepository.findByCategory(category);
    }
    
    @Override
    public List<Payment> getPaymentByShopname(String shopname) {
        return PaymentRepository.findByShopname(shopname);
    }
    
    @Override
    public List<Payment> getPaymentByParentaccount(int parentaccount) {
        return PaymentRepository.findByParentaccount(parentaccount);
    }

    @Override
    public Payment addPayment(Payment payment) {
        return PaymentRepository.insert(payment);
    }

    @Override
    public Payment updatePayment(Payment newpayment) {
        return PaymentRepository.save(newpayment);
    }

    @Override
    public void deletePayment(Payment payment) {
        PaymentRepository.delete(payment);
    }

    
}
