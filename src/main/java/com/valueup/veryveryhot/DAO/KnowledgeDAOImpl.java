package com.valueup.veryveryhot.DAO;

import java.util.List;
import java.util.Optional;

import com.valueup.veryveryhot.Model.Knowledge;
import com.valueup.veryveryhot.Repository.KnowledgeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class KnowledgeDAOImpl implements KnowledgeDAO{

    @Autowired
    private final KnowledgeRepository KnowledgeRepository;

    public KnowledgeDAOImpl(KnowledgeRepository KnowledgeRepository) {
        this.KnowledgeRepository = KnowledgeRepository;
    }

    @Override
    public List<Knowledge> getAllKnowledge() {
        return KnowledgeRepository.findAll();
    }

    @Override
    public Knowledge getKnowledgeById(String id) {
        Optional<Knowledge> Knowledge = KnowledgeRepository.findById(id);
        return Knowledge.get();
    }

    @Override
    public Knowledge addKnowledge(Knowledge knowledge) {
        return KnowledgeRepository.insert(knowledge);
    }

    @Override
    public Knowledge updateKnowledge(Knowledge knowledge) {
        return KnowledgeRepository.save(knowledge);
    }

    @Override
    public void deleteKnowledge(Knowledge knowledge) {
        KnowledgeRepository.delete(knowledge);
     }

    
}
