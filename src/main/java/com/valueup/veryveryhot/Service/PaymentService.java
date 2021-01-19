package com.valueup.veryveryhot.Service;

import java.util.List;

import com.valueup.veryveryhot.DAO.PaymentDAOImpl;
import com.valueup.veryveryhot.Model.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentDAOImpl paymentDAO;

    @Autowired
    public PaymentService(PaymentDAOImpl paymentDAO) {
        this.paymentDAO = paymentDAO;
    }

    public List<Payment> getAllPayments() {
        return paymentDAO.getAllPayments();
    }

    public Payment getPayment(String id) {
        return paymentDAO.getPaymentById(id);
    }

    public Payment getPaymentByCategory(String category) {
        return paymentDAO.getPaymentByCategory(category);
    }
    
    public Payment getPaymentByShopname(String shopname) {
        return paymentDAO.getPaymentByShopname(shopname);
    }

    public Payment addPayment(Payment payment) {
        return paymentDAO.addPayment(payment);
    }

    public Payment updatePayment(Payment payment) {
        return paymentDAO.updatePayment(payment);
    }

    public void removePayment(String id) {
        Payment payment = paymentDAO.getPaymentById(id);
        paymentDAO.deletePayment(payment);
    }
    
}
