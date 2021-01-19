package com.valueup.veryveryhot.Service;

import java.util.List;

import com.valueup.veryveryhot.DAO.InterestDAOImpl;
import com.valueup.veryveryhot.Model.Interest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterestService {
 
    private final InterestDAOImpl interestDAO;

    @Autowired
    public InterestService(InterestDAOImpl interestDAO) {
        this.interestDAO = interestDAO;
    }

    public List<Interest> getAllInterests(){
        return interestDAO.getAllInterests();
    }

    public Interest getInterest(String interest){
        return interestDAO.getInterestById(interest);
    }

    public Interest getInterestByParentid(String parentid){
        return interestDAO.getInterestByInterestname(parentid);
    }

    public Interest getInterestByInterestname(String interestname){
        return interestDAO.getInterestByInterestname(interestname);
    }

    public Interest addInterest(Interest interest){
        return interestDAO.addInterest(interest);
    }

    public Interest updateInterest(Interest interest){
        return interestDAO.updateInterest(interest);
    }

    public void removeInterest(String id){
        Interest interest = interestDAO.getInterestById(id);
        interestDAO.deleteInterest(interest);
    }
}
