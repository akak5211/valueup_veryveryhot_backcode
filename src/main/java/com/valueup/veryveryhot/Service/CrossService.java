package com.valueup.veryveryhot.Service;

import com.valueup.veryveryhot.DAO.CrossDAOImpl;
import com.valueup.veryveryhot.Model.Cross;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrossService {

    private final CrossDAOImpl crossDAO;

    @Autowired
    public CrossService(CrossDAOImpl crossDAO) {
        this.crossDAO = crossDAO;
    }

    public List<Cross> getAllCross(){
        return crossDAO.getAllCross();
    }

    public Cross getCross(String cross){
        return crossDAO.getCrossById(cross);
    }

    public Cross getCrossByCrossurl(String crossurl){
        return crossDAO.getCrossByCrossurl(crossurl);
    }

    public Cross addCross(Cross cross){
        return crossDAO.addCross(cross);
    }

    public Cross updateCross(Cross cross){
        return crossDAO.updateCross(cross);
    }

    public void removeCross(String id){
        Cross cross = crossDAO.getCrossById(id);
        crossDAO.deleteCross(cross);
    }


  
}
