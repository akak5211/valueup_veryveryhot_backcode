package com.valueup.veryveryhot.Service;

import com.valueup.veryveryhot.DAO.BankDAOImpl;
import com.valueup.veryveryhot.Model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    
    private final BankDAOImpl bankDAO;

    @Autowired
    public BankService(BankDAOImpl bankDAO) {
        this.bankDAO = bankDAO;
    }

    public List<Bank> getAllBank(){
        return bankDAO.getAllBank();
    }

    public Bank getBank(String bank){
        return bankDAO.getBankById(bank);
    }

    public List<Bank> getBankByParentid(String parentid){
        return bankDAO.getBankByParentid(parentid);
    }


    public Bank addBank(Bank bank){
        return bankDAO.addBank(bank);
    }

    public Bank updateBank(Bank bank){
        return bankDAO.updateBank(bank);
    }

    public void removeBank(String id){
        Bank bank = bankDAO.getBankById(id);
        bankDAO.deleteBank(bank);
    }

}