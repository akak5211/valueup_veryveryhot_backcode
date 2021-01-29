package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Repository.BankRepository;
import com.valueup.veryveryhot.Model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BankDAOImpl implements BankDAO{

    @Autowired
    private final BankRepository BankRepository;

    public BankDAOImpl(BankRepository BankRepository){
        this.BankRepository = BankRepository;
    }

    @Override
    public List<Bank> getAllBank() {
        return BankRepository.findAll();
    }

    @Override
    public Bank addBank(Bank bank) {
        return BankRepository.insert(bank);
    }

    @Override
    public Bank getBankById(String id) {
        Optional<Bank> Bank = BankRepository.findById(id);
        return Bank.get();
    }

    @Override
    public List<Bank> getBankByParentid(String parentid) {
        return BankRepository.findByParentid(parentid);

    }

    @Override
    public Bank updateBank(Bank newbank) {
        return BankRepository.save(newbank);
    }

    @Override
    public void deleteBank(Bank bank) {
       BankRepository.delete(bank);
    }

}