package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Model.Like;
import java.util.List;

public interface LikeDAO{
    public List<Like> getAllLike();

    public Like getLikeById(String id);

    public Like getLikeByLikepeople(String likepeople);
    
    public Like getLikeByParentqnaid(String parentqnaid);

    public Like addLike(Like like);

    public Like updateLike(Like like);

    public void deleteLike(Like like);
}
