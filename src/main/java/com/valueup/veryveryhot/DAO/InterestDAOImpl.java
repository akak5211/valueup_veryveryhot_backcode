package com.valueup.veryveryhot.DAO;

import java.util.List;
import java.util.Optional;

import com.valueup.veryveryhot.Model.Interest;
import com.valueup.veryveryhot.Repository.InterestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InterestDAOImpl implements InterestDAO{
    
    @Autowired
    private final InterestRepository InterestRepository;

    public InterestDAOImpl(InterestRepository InterestRepository) {
        this.InterestRepository = InterestRepository;
    }

    @Override
    public List<Interest> getAllInterests() {
        return InterestRepository.findAll();
    }
    
    @Override
    public Interest getInterestById(String id) {
        Optional<Interest> Interest = InterestRepository.findById(id);
        return Interest.get();

    }

    @Override
    public Interest getInterestByParentid(String parentid) {
        return InterestRepository.findByParentid(parentid);
    }

    @Override
    public Interest getInterestByInterestname(String interestname) {
        return InterestRepository.findByInterestname(interestname);
    }
    
    @Override
    public Interest addInterest(Interest interest){
        return InterestRepository.insert(interest);

    }

    @Override
    public Interest updateInterest(Interest newinterest) {
        return InterestRepository.save(newinterest);
    }

    @Override
    public void deleteInterest(Interest interest) {
        InterestRepository.delete(interest);
    }

}
