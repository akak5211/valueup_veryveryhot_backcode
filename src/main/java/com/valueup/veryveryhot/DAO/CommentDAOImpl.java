package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Repository.CommentRepository;
import com.valueup.veryveryhot.Model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CommentDAOImpl implements CommentDAO{

    @Autowired
    private final CommentRepository CommentRepository;

    public CommentDAOImpl(CommentRepository CommentRepository){
        this.CommentRepository = CommentRepository;
    }

    @Override
    public List<Comment> getAllComment() {
        return CommentRepository.findAll();
    }

    @Override
    public Comment addComment(Comment comment) {
        return CommentRepository.insert(comment);
    }

    @Override
    public Comment updateComment(Comment newcomment) {
        return CommentRepository.save(newcomment);
    }

    @Override
    public void deleteComment(Comment comment) {
       CommentRepository.delete(comment);
    }

    @Override
    public Comment getCommentById(String id) {
        Optional<Comment> Comment = CommentRepository.findById(id);
        return Comment.get();
    }

    public Comment getCommentByCommentpeople(String commentpeople){
        return CommentRepository.findByCommentpeople(commentpeople);
    }

    public Comment getCommentByCommentcontent(String commentcontent){
        return CommentRepository.findByCommentcontent(commentcontent);
    }

    public Comment getCommentByCommentdate(String commentdate){
        return CommentRepository.findByCommentdate(commentdate);  
    }

    public List<Comment> getCommentByParentid(String parentid){
        return CommentRepository.findByParentid(parentid);
    }
}
