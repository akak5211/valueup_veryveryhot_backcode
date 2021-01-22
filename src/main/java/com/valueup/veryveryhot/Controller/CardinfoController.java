package com.valueup.veryveryhot.Controller;


import java.util.List;

import com.valueup.veryveryhot.Model.Cardinfo;
import com.valueup.veryveryhot.Service.CardinfoService;

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
public class CardinfoController {

    @Autowired
    private final CardinfoService cardinfoService;

    public CardinfoController(CardinfoService cardinfoService) {
        this.cardinfoService = cardinfoService;
    }

    @GetMapping("api/v1/cardinfo")
    public List<Cardinfo> getAll() {
        return cardinfoService.getAllCardinfo();
    }

    @GetMapping("api/v1/cardinfo/{id}")
    public Cardinfo getByID(@PathVariable("id") String id) {
        return cardinfoService.getCardinfo(id);
    }

    @GetMapping("api/v1/cardinfo/company/{companyname}")
    public Cardinfo getByCompanyname(@PathVariable("companyname") String companyname) {
        return cardinfoService.getCardinfoByCompanyname(companyname);
    }
    
    @GetMapping("api/v1/cardinfo/rewards/{rewards}")
    public Cardinfo getByRewards(@PathVariable("rewards") List<String> rewards) {
        return cardinfoService.getCardinfoByRewards(rewards);
    }

  
    @PostMapping("api/v1/cardinfo/add")
    @ResponseStatus(value=HttpStatus.OK)
        public Cardinfo addCardinfo(@RequestBody Cardinfo cardinfo){
        return cardinfoService.addCardinfo(cardinfo);
    }

    @DeleteMapping("api/v1/cardinfo/delete/{id}")
    public void removeCardinfo(@PathVariable String id) {
        cardinfoService.removeCardinfo(id);
     }
    
}
