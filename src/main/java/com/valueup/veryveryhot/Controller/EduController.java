package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.Edu;
import com.valueup.veryveryhot.Service.EduService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping(value = "api/v1/edu", method = {RequestMethod.GET,RequestMethod.POST}) //v1 빼니 오류 발생함
@RestController

public class EduController {
    
    @Autowired
    private final EduService eduService;

    public EduController(EduService eduService) {
        this.eduService = eduService;
    }

    //Get http methods controllers
    
    @RequestMapping(value = "api/v1/edu", method = {RequestMethod.GET})
        public List<Edu> getAll(){
        return eduService.getAllEdu();
    }

    @RequestMapping(value = "api/v1/edu/eduname/{eduname}", method = {RequestMethod.GET})
    public Edu getByName(@PathVariable("eduname") String eduname) {
        return eduService.getEduByName(eduname);
    }

    @RequestMapping(value = "api/v1/edu/eduurl/{eduurl}", method = {RequestMethod.GET})
    public Edu getByUrl(@PathVariable("eduurl") String eduurl) {
        return eduService.getEduByUrl(eduurl);
    }

    @RequestMapping(value = "api/v1/edu/eduimgurl/{eduimgurl}", method = {RequestMethod.GET})
    public Edu getByImgurl(@PathVariable("eduimgurl") String eduimgurl) {
        return eduService.getEduByImgurl(eduimgurl);
    }

    @GetMapping("api/v1/edu/educategory/{educategory}")
    public List<Edu> getByEducategory(@PathVariable("educategory") String educategory) {
        return eduService.getEduByEducategory(educategory);
    }
    
    //Non-Get http method controllers

    @RequestMapping(value = "api/v1/edu/create", method = {RequestMethod.POST})
    @ResponseStatus(value=HttpStatus.OK)
        public Edu addEdu(@RequestBody Edu edu){
        return eduService.addEdu(edu);
    }

    @DeleteMapping(value = "api/v1/edu/delete/{id}")
    public void removeEdu(@PathVariable String id){
        eduService.removeEdu(id);
    }
}
