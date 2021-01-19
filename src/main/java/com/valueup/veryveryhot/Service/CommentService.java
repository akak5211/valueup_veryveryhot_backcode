package com.valueup.veryveryhot.Service;

import com.valueup.veryveryhot.DAO.CommentDAOImpl;
import com.valueup.veryveryhot.Model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentDAOImpl commentDAO;

    @Autowired
    public CommentService(CommentDAOImpl commentDAO) {
        this.commentDAO = commentDAO;
    }

    public List<Comment> getAllComment(){
        return commentDAO.getAllComment();
    }

    public Comment getComment(String comment){
        return commentDAO.getCommentById(comment);
    }
    
    public Comment getCommentByCommentpeople(String commentpeople){
        return commentDAO.getCommentByCommentpeople(commentpeople);
    }

    public Comment getCommentByCommentcontent(String commentcontent){
        return commentDAO.getCommentByCommentcontent(commentcontent);
    }

    public Comment getCommentByCommentdate(String commentdate){
        return commentDAO.getCommentByCommentdate(commentdate);
    }

    public Comment getCommentByParentid(String parentid){
        return commentDAO.getCommentByParentid(parentid);
    }

    public Comment addComment(Comment comment){
        return commentDAO.addComment(comment);
    }

    public Comment updateComment(Comment comment){
        return commentDAO.updateComment(comment);
    }

    public void removeComment(String id){
        Comment comment = commentDAO.getCommentById(id);
        commentDAO.deleteComment(comment);
    }

}
