package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.Knowledge;
import com.valueup.veryveryhot.Service.KnowledgeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KnowledgeController {

    @Autowired
    private final KnowledgeService knowledgeService;

    public KnowledgeController(KnowledgeService knowledgeService) {
        this.knowledgeService = knowledgeService;
    }

    @GetMapping(value = "api/v1/knowledge")
    public List<Knowledge> getAll() {
        return knowledgeService.getAllKnowledge();
    }

    @GetMapping(value = "api/v1/knowledge/{id}")
    public Knowledge getById(@PathVariable("id") String id) {
        return knowledgeService.getKnowledge(id);
    }

    @PostMapping(value = "api/v1/knowledge/create")
    @ResponseStatus(value=HttpStatus.OK)
        public Knowledge addKnowledge(@RequestBody Knowledge knowledge){
        return knowledgeService.addKnowledge(knowledge);  
     }

    @PutMapping(value = "api/v1/knowledge/update/{id}")
    @ResponseStatus(value=HttpStatus.OK)
    public Knowledge updateKnowledge(@PathVariable(value = "id") String id, @RequestBody Knowledge knowledge){
            return knowledgeService.updateKnowledge(knowledge);
    }

    @DeleteMapping(value = "api/v1/knowledge/delete/{id}")
    public void removeKnowledge(@PathVariable String id){
        knowledgeService.removeKnowledge(id);
    }

    
}
