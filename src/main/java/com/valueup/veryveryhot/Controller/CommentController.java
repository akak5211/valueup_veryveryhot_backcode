package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.Comment;
import com.valueup.veryveryhot.Service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @RequestMapping(value = "api/v1/comment", method = {RequestMethod.GET})
    public List<Comment> getAll(){
    return commentService.getAllComment();
    }
    
    @RequestMapping(value = "api/v1/comment/{id}", method = {RequestMethod.GET})
    public Comment getById(@PathVariable("id") String id) {
        return commentService.getComment(id);
    }

    @RequestMapping(value = "api/v1/comment/create", method = {RequestMethod.POST})
    @ResponseStatus(value=HttpStatus.OK)
        public Comment addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);  
    }

    @GetMapping("api/v1/comment/parentid/{parentid}")
    public List<Comment> getByParentid(@PathVariable("parentid") String parentid) {
        return commentService.getCommentByParentid(parentid);
    }

    @DeleteMapping(value = "api/v1/comment/delete/{id}")
    public void removeComment(@PathVariable String id){
        commentService.removeComment(id);
    }

    @PutMapping(value = "api/v1/comment/update/{id}")
    @ResponseStatus(value=HttpStatus.OK)
    public Comment updaComment(@PathVariable(value = "id") String id, @RequestBody Comment comment){
            return commentService.updateComment(comment);
    }

}
