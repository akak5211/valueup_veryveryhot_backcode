package com.valueup.veryveryhot.Service;

import java.util.List;

import com.valueup.veryveryhot.DAO.KnowledgeDAOImpl;
import com.valueup.veryveryhot.Model.Knowledge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KnowledgeService {

    private final KnowledgeDAOImpl knowledgeDAO;

    @Autowired
    public KnowledgeService(KnowledgeDAOImpl knowledgeDAO) {
        this.knowledgeDAO = knowledgeDAO;
    }

    public List<Knowledge> getAllKnowledge(){
        return knowledgeDAO.getAllKnowledge();
    }

    public Knowledge getKnowledge(String id){
        return knowledgeDAO.getKnowledgeById(id);
    }

    public Knowledge addKnowledge(Knowledge knowledge){
        return knowledgeDAO.addKnowledge(knowledge);
    }

    public Knowledge updateKnowledge(Knowledge knowledge){
        return knowledgeDAO.updateKnowledge(knowledge);
    }

    public void removeKnowledge(String id){
        Knowledge knowledge = knowledgeDAO.getKnowledgeById(id);
        knowledgeDAO.deleteKnowledge(knowledge);
    }

    
}
