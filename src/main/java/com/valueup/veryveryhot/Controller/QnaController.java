package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.Qna;
import com.valueup.veryveryhot.Service.QnaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QnaController {
    
    @Autowired
    private final QnaService qnaService;

    public QnaController(QnaService qnaService) {
        this.qnaService = qnaService;
    }

    @RequestMapping(value = "api/v1/qna", method = {RequestMethod.GET})
    public List<Qna> getAll(){
    return qnaService.getAllQna();
    }

    @RequestMapping(value = "api/v1/qna/{qnatitle}", method = {RequestMethod.GET})
    public Qna getByQnatitle(@PathVariable("qnatitle") String qnatitle) {
        return qnaService.getQnaByQnatitle(qnatitle);
    }

    @RequestMapping(value = "api/v1/qna/create", method = {RequestMethod.POST})
    @ResponseStatus(value=HttpStatus.OK)
        public Qna addqna(@RequestBody Qna qna){
        return qnaService.addQna(qna);  
     }

    @RequestMapping(value = "api/v1/qna/update/{id}", method = {RequestMethod.PUT})
    @ResponseStatus(value=HttpStatus.OK)
    public Qna updateQna(@PathVariable(value = "id") String id, @RequestBody Qna qna){
            return qnaService.updateQna(qna);
    }

     @DeleteMapping(value = "api/v1/qna/delete/{id}")
     public void removeQna(@PathVariable String id){
         qnaService.removeQna(id);
     }

}
