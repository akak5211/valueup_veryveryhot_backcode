package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Repository.EduRepository;
import com.valueup.veryveryhot.Model.Edu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EduDAOImpl implements EduDAO {
    
    @Autowired
    private final EduRepository EduRepository;

    public EduDAOImpl(EduRepository EduRepository){
        this.EduRepository = EduRepository;
    }

    @Override
    public List<Edu> getAllEdu() {
        return EduRepository.findAll();
    }

    @Override
    public Edu addEdu(Edu edu) {
        return EduRepository.insert(edu);
    }

    @Override
    public Edu getEduById(String id) {
        Optional<Edu> Edu = EduRepository.findById(id);
        return Edu.get();
    }

    @Override
    public Edu getEduByEduname(String eduname){
        return EduRepository.findByEduname(eduname);
    }

    @Override
    public Edu getEduByEduurl(String eduurl){
       return EduRepository.findByEduurl(eduurl);
    }

    @Override
    public Edu getEduByEduage(String eduage){
        return EduRepository.findByEduage(eduage);
    }

    @Override
    public Edu updateEdu(Edu newedu) {
        return EduRepository.save(newedu);
    }

    @Override
    public void deleteEdu(Edu edu) {
       EduRepository.delete(edu);
    }




}