package com.valueup.veryveryhot.DAO;

import java.util.List;

import com.valueup.veryveryhot.Model.Cardinfo;

public interface CardinfoDAO {

    public List<Cardinfo> getAllCardinfo();

    public Cardinfo getCardinfoById(String id);

    public List<Cardinfo> getCardinfoByCompanyname(String companyname);

    public List<Cardinfo> getCardinfoByRewardsIn(String rewards);

    public Cardinfo addCardinfo(Cardinfo cardinfo);

    public Cardinfo updateCardinfo(Cardinfo cardinfo);

    public void deleteCardinfo(Cardinfo cardinfo);
    
}
