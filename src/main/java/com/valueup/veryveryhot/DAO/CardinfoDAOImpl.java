package com.valueup.veryveryhot.DAO;


import java.util.List;
import java.util.Optional;

import com.valueup.veryveryhot.Model.Cardinfo;
import com.valueup.veryveryhot.Repository.CardinfoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CardinfoDAOImpl implements CardinfoDAO {

    @Autowired
    private final CardinfoRepository CardinfoRepository;


    public CardinfoDAOImpl(CardinfoRepository CardinfoRepository){
        this.CardinfoRepository = CardinfoRepository;
    }

    @Override
    public List<Cardinfo> getAllCardinfo() {
        return CardinfoRepository.findAll();
    }


    @Override
    
    public Cardinfo getCardinfoById(String id) {
        Optional<Cardinfo> Cardinfo = CardinfoRepository.findById(id);
        return Cardinfo.get();
    }

    @Override
    public List<Cardinfo> getCardinfoByCompanyname(String companyname) {
        return CardinfoRepository.findByCompanyname(companyname);
    }

    @Override
    public List<Cardinfo> getCardinfoByRewardsIn(String rewards) {
        return CardinfoRepository.findByRewardsIn(rewards);
    }
    
    @Override
    public Cardinfo addCardinfo(Cardinfo cardinfo) {
        return CardinfoRepository.insert(cardinfo);
    }

    @Override
    public Cardinfo updateCardinfo(Cardinfo cardinfo) {
        return CardinfoRepository.save(cardinfo);
    }

    @Override
    public void deleteCardinfo(Cardinfo cardinfo) {
       CardinfoRepository.delete(cardinfo);
    }

    
}
