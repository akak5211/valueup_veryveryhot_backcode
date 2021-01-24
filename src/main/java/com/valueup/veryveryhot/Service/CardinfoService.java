package com.valueup.veryveryhot.Service;

import java.util.List;

import com.valueup.veryveryhot.DAO.CardinfoDAOImpl;
import com.valueup.veryveryhot.Model.Cardinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardinfoService {

    private final CardinfoDAOImpl cardinfoDAO;

    @Autowired
    public CardinfoService(CardinfoDAOImpl cardinfoDAO) {
        this.cardinfoDAO = cardinfoDAO;
    }

    public List<Cardinfo> getAllCardinfo(){
        return cardinfoDAO.getAllCardinfo();
    }

    public Cardinfo getCardinfo(String id){
        return cardinfoDAO.getCardinfoById(id);
    }

    public List<Cardinfo> getCardinfoByCompanyname(String companyname){
        return cardinfoDAO.getCardinfoByCompanyname(companyname);
    }

  
    public List<Cardinfo> getCardinfoByRewardsIn(List<String> rewards) {
        return cardinfoDAO.getCardinfoByRewardsIn(rewards);
    }
    
    
    public Cardinfo addCardinfo(Cardinfo cardinfo) {
        return cardinfoDAO.addCardinfo(cardinfo);
    }

    
    public Cardinfo updateCardinfo(Cardinfo cardinfo) {
        return cardinfoDAO.updateCardinfo(cardinfo);
    }

   
    public void removeCardinfo(String id) {
       Cardinfo cardinfo = cardinfoDAO.getCardinfoById(id);
       cardinfoDAO.deleteCardinfo(cardinfo);

    }
    
    
}
