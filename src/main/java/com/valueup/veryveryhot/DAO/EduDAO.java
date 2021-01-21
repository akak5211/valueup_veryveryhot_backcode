package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Model.Edu;

import java.util.List;

public interface EduDAO {

    public List<Edu> getAllEdu();
    
    public Edu getEduById(String id);

    public Edu getEduByEduname(String eduname);

    public Edu getEduByEduurl(String eduurl);

    public Edu getEduByEduage(String eduage);

    public Edu getEduByEduimgurl(String eduimgurl);
    
    public Edu addEdu(Edu edu);

    public Edu updateEdu(Edu edu);

    public void deleteEdu(Edu edu);
    
}
