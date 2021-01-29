package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Model.Bank;

import java.util.List;

public interface BankDAO{
    public List<Bank> getAllBank();

    public Bank getBankById(String id);

    public List<Bank> getBankByParentid(String parentid);

    public Bank addBank(Bank bank);

    public Bank updateBank(Bank bank);

    public void deleteBank(Bank bank);
}
