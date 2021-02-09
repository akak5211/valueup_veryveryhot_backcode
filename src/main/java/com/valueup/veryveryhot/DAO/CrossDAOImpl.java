package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Repository.CrossRepository;
import com.valueup.veryveryhot.Model.Cross;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CrossDAOImpl implements CrossDAO{

    @Autowired
    private final CrossRepository CrossRepository;

    public CrossDAOImpl(CrossRepository CrossRepository){
        this.CrossRepository = CrossRepository;
    }

    @Override
    public List<Cross> getAllCross() {
        return CrossRepository.findAll();
    }

    @Override
    public Cross addCross(Cross cross) {
        return CrossRepository.insert(cross);
    }

    @Override
    public Cross getCrossByScore(int score) {
        return CrossRepository.findByScore(score);
    }

    @Override
    public Cross getCrossByCategory(String category) {
        return CrossRepository.findByCategory(category);
    }

    @Override
    public Cross getCrossById(String id) {
        Optional<Cross> Cross = CrossRepository.findById(id);
        return Cross.get();
    }

    @Override
    public Cross updateCross(Cross newcross) {
        return CrossRepository.save(newcross);
    }

    @Override
    public void deleteCross(Cross cross) {
       CrossRepository.delete(cross);
    }
    
}
