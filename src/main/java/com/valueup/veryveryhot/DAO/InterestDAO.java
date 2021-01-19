package com.valueup.veryveryhot.DAO;

import java.util.List;

import com.valueup.veryveryhot.Model.Interest;

public interface InterestDAO {

    public List<Interest> getAllInterests();
    
    public Interest getInterestById(String id);

    public Interest getInterestByParentid(String parentid);

    public Interest getInterestByInterestname(String interestname);
    
    public Interest addInterest(Interest interest);

    public Interest updateInterest(Interest interest);

    public void deleteInterest(Interest interest);
    
}
