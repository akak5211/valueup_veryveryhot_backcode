package com.valueup.veryveryhot.DAO;

import java.util.List;

import com.valueup.veryveryhot.Model.Knowledge;

public interface KnowledgeDAO {
    public List<Knowledge> getAllKnowledge();

    public Knowledge getKnowledgeById(String id);

    public Knowledge addKnowledge(Knowledge knowledge);

    public Knowledge updateKnowledge(Knowledge knowledge);

    public void deleteKnowledge(Knowledge knowledge);
}
