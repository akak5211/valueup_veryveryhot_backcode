package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Model.Comment;

import java.util.List;


public interface CommentDAO {
    public List<Comment> getAllComment();

    public Comment getCommentById(String id);

    public Comment getCommentByCommentpeople(String commentpeople);

    public Comment getCommentByCommentcontent(String commentcontent);

    public Comment getCommentByCommentdate(String commentdate);

    public Comment getCommentByParentid(String parentid);

    public Comment addComment(Comment comment);

    public Comment updateComment(Comment comment);

    public void deleteComment(Comment comment);

    
}
