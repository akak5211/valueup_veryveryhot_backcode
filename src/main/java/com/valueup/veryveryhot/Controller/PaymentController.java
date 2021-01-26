package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.Payment;
import com.valueup.veryveryhot.Service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("api/v1/payment")
    public List<Payment> getAll() {
        return paymentService.getAllPayments();
    }

    @GetMapping("api/v1/payment/{id}")
    public Payment getByID(@PathVariable("id") String id) {
        return paymentService.getPayment(id);
    }

    @GetMapping("api/v1/payment/category/{category}")
    public List<Payment> getByCategory(@PathVariable("category") String category) {
        return paymentService.getPaymentByCategory(category);
    }
    
    @GetMapping("api/v1/payment/shopname/{shopname}")
    public List<Payment> getByShopname(@PathVariable("shopname") String shopname) {
        return paymentService.getPaymentByShopname(shopname);
    }

    @GetMapping("api/v1/payment/parentid/{parentid}")
    public List<Payment> getByParentid(@PathVariable("parentid") int parentid) {
        return paymentService.getPaymentByParentid(parentid);
    }

    @PostMapping("api/v1/payment/create")
    @ResponseStatus(value=HttpStatus.OK)
        public Payment addPayment(@RequestBody Payment payment){
        return paymentService.addPayment(payment);
    }

    @DeleteMapping("api/v1/payment/delete/{id}")
    public void removePayment(@PathVariable String id) {
        paymentService.removePayment(id);
    }
    
}
