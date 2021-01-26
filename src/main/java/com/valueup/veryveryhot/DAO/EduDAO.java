package com.valueup.veryveryhot.DAO;

import java.util.List;

import com.valueup.veryveryhot.Model.Edu;

public interface EduDAO {

    public List<Edu> getAllEdu();
    
    public Edu getEduById(String id);

    public Edu getEduByEduname(String eduname);

    public Edu getEduByEduurl(String eduurl);

    public List<Edu> getEduByEduage(String eduage);
    
    public List<Edu> getEduByEducategory(String educategory);
    
    public Edu addEdu(Edu edu);

    public Edu updateEdu(Edu edu);

    public void deleteEdu(Edu edu);
    
}
