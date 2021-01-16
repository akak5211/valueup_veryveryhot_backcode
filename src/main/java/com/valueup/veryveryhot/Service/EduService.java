package com.valueup.veryveryhot.Service;

import com.valueup.veryveryhot.DAO.EduDAOImpl;
import com.valueup.veryveryhot.Model.Edu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EduService {

    private final EduDAOImpl eduDAO;

    @Autowired
    public EduService(EduDAOImpl eduDAO) {
        this.eduDAO = eduDAO;
    }

    public List<Edu> getAllEdu(){
        return eduDAO.getAllEdu();
    }

    public Edu getEdu(String edu){
        return eduDAO.getEduById(edu);
    }

    public Edu getEduByName(String eduname){
        return eduDAO.getEduByEduname(eduname);
    }

    public Edu getEduByUrl(String eduurl){
        return eduDAO.getEduByEduurl(eduurl);
    }

    public Edu getEduByAge(String eduage){
        return eduDAO.getEduByEduage(eduage);
    }

    public Edu addEdu(Edu edu){
        return eduDAO.addEdu(edu);
    }

    public Edu updateEdu(Edu edu){
        return eduDAO.updateEdu(edu);
    }

    public void removeEdu(String id){
        Edu edu = eduDAO.getEduById(id);
        eduDAO.deleteEdu(edu);
    }

    
}
