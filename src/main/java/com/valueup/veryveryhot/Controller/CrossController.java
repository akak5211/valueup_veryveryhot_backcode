package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.Cross;
import com.valueup.veryveryhot.Service.CrossService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class CrossController {

    @Autowired
    private final CrossService crossService;

    public CrossController(CrossService crossService) {
        this.crossService = crossService;
    }
    
    @RequestMapping(value = "api/v1/cross", method = {RequestMethod.GET})
        public List<Cross> getAll(){
        return crossService.getAllCross();
    }

    @PostMapping("api/v1/cross/add")
    @ResponseStatus(value=HttpStatus.OK)
        public Cross addCross(@RequestBody Cross cross){
        return crossService.addCross(cross);
    }

    @DeleteMapping("api/v1/cross/delete/{id}")
    public void removeCross(@PathVariable String id) {
        crossService.removeCross(id);
    }

}
