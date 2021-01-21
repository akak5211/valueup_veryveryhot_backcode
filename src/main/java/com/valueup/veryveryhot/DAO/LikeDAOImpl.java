package com.valueup.veryveryhot.DAO;


import com.valueup.veryveryhot.Repository.LikeRepository;
import com.valueup.veryveryhot.Model.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LikeDAOImpl implements LikeDAO{

    @Autowired
    private final LikeRepository LikeRepository;

    public LikeDAOImpl(LikeRepository LikeRepository){
        this.LikeRepository = LikeRepository;
    }

    @Override
    public List<Like> getAllLike() {
        return LikeRepository.findAll();
    }

    @Override
    public Like addLike(Like like) {
        return LikeRepository.insert(like);
    }

    @Override
    public Like getLikeById(String id) {
        Optional<Like> Like = LikeRepository.findById(id);
        return Like.get();
    }

    @Override
    public Like getLikeByLikepeople(String likepeople){
        return LikeRepository.findByLikepeople(likepeople);
    }

    @Override
    public Like getLikeByParentqnaid(String parentqnaid) {
        return LikeRepository.findByParentqnaid(parentqnaid);

    }

    @Override
    public Like updateLike(Like like) {
        return LikeRepository.save(like);
    }

    @Override
    public void deleteLike(Like Like) {
       LikeRepository.delete(Like);
    }

}
