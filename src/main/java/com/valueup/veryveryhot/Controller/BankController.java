package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.Bank;
import com.valueup.veryveryhot.Service.BankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping(value = "api/v1/user", method = {RequestMethod.GET,RequestMethod.POST}) //v1 빼니 오류 발생함
@RestController

public class BankController {
    
    @Autowired
    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    //Get http methods controllers
    
    @RequestMapping(value = "api/v1/bank", method = {RequestMethod.GET})
        public List<Bank> getAll(){
        return bankService.getAllBank();
    }

    @RequestMapping(value = "api/v1/bankid/{parentid}", method = {RequestMethod.GET})
    public List<Bank> getByPatentid(@PathVariable("parentid") String parentid) {
        return bankService.getBankByParentid(parentid);
    }
    
    
    //Non-Get http method controllers

    @RequestMapping(value = "api/v1/bank/create", method = {RequestMethod.POST})
    @ResponseStatus(value=HttpStatus.OK)
        public Bank addBank(@RequestBody Bank bank){
        return bankService.addBank(bank);
    }

    @DeleteMapping(value = "api/v1/bank/delete/{id}")
    public void removeBank(@PathVariable String id){
        bankService.removeBank(id);
    }
    

    
}
