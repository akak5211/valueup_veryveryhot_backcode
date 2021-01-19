package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.Interest;
import com.valueup.veryveryhot.Service.InterestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterestController {

    @Autowired
    private final InterestService interestService;

    public InterestController(InterestService interestService) {
        this.interestService = interestService;
    }

    @GetMapping("api/v1/interest")
    public List<Interest> getAll() {
        return interestService.getAllInterests();
    }

    @GetMapping("api/v1/interest/{id}")
    public Interest getByID(@PathVariable("id") String id) {
        return interestService.getInterest(id);
    }

    @GetMapping("api/v1/interest/parentid/{parentid}")
    public Interest getByParentid(@PathVariable("parentid") String parentid) {
        return interestService.getInterestByParentid(parentid);
    }
    
    @GetMapping("api/v1/interest/interestname/{interestname}")
    public Interest getByInterestname(@PathVariable("interestname") String interestname) {
        return interestService.getInterestByInterestname(interestname);
    }

    @PostMapping("api/v1/interest/add")
    @ResponseStatus(value=HttpStatus.OK)
        public Interest addInterest(@RequestBody Interest Interest){
        return interestService.addInterest(Interest);
    }

    @DeleteMapping("api/v1/interest/delete/{id}")
    public void removeInterest(@PathVariable String id) {
        interestService.removeInterest(id);
    }
}
