package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.Like;
import com.valueup.veryveryhot.Service.LikeService;

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
public class LikeController {

    @Autowired
    private final LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    //Get http methods controllers
    
    @RequestMapping(value = "api/v1/Like", method = {RequestMethod.GET})
        public List<Like> getAll(){
        return likeService.getAllLike();
    }

    @RequestMapping(value = "api/v1/like/{parentqnaid}", method = {RequestMethod.GET})
    public Like getByPatentid(@PathVariable("parentqnaid") String parentqnaid) {
        return likeService.getLikeByParentqnaid(parentqnaid);
    }
    
    //Non-Get http method controllers

    @RequestMapping(value = "api/v1/like/create", method = {RequestMethod.POST})
    @ResponseStatus(value=HttpStatus.OK)
        public Like addLike(@RequestBody Like like){
        return likeService.addLike(like);
    }

    @DeleteMapping(value = "api/v1/Like/delete/{id}")
    public void removeLike(@PathVariable String id){
        likeService.removeLike(id);
    }
    
}
