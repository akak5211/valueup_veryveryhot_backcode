package com.valueup.veryveryhot.DAO;

import java.util.List;

import com.valueup.veryveryhot.Model.Payment;

public interface PaymentDAO {
    public List<Payment> getAllPayments();

    public Payment getPaymentById(String id);

    public Payment getPaymentByCategory(String category);

    public Payment getPaymentByShopname(String shopname);

    public Payment addPayment(Payment payment);

    public Payment updatePayment(Payment payment);

    public void deletePayment(Payment payment);
    
}
