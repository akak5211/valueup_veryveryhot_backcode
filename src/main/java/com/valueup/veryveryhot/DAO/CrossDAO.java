package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Model.Cross;

import java.util.List;

public interface CrossDAO {
    public List<Cross> getAllCross();

    public Cross getCrossById(String id);

    public Cross getCrossByCrossurl(String crossurl);

    public Cross getCrossByImgurl(String imgurl);

    public Cross addCross(Cross cross);

    public Cross updateCross(Cross cross);

    public void deleteCross(Cross cross);


    
}
