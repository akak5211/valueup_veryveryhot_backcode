package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Model.Cross;

import java.util.List;

public interface CrossDAO {
    public List<Cross> getAllCross();

    public Cross getCrossById(String id);

    public Cross getCrossByScore(int score);

    public Cross getCrossByCategory(String category);

    public Cross addCross(Cross cross);

    public Cross updateCross(Cross cross);

    public void deleteCross(Cross cross);


    
}
