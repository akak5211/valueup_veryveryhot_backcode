package com.valueup.veryveryhot.Service;

import com.valueup.veryveryhot.DAO.LikeDAOImpl;
import com.valueup.veryveryhot.Model.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {
    
    private final LikeDAOImpl likeDAO;

    @Autowired
    public LikeService(LikeDAOImpl likeDAO) {
        this.likeDAO = likeDAO;
    }

    public List<Like> getAllLike(){
        return likeDAO.getAllLike();
    }

    public Like getLikeByLikepeople(String likepeople){
        return likeDAO.getLikeByLikepeople(likepeople);

    }

    public Like getLikeByParentqnaid(String parentqnaid){
        return likeDAO.getLikeByParentqnaid(parentqnaid);
    }

    public Like addLike(Like like){
        return likeDAO.addLike(like);
    }

    public Like updateLike(Like like){
        return likeDAO.updateLike(like);
    }

    public void removeLike(String id){
        Like like = likeDAO.getLikeById(id);
        likeDAO.deleteLike(like);
    }

}
