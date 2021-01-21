package com.valueup.veryveryhot.Repository;

import com.valueup.veryveryhot.Model.Like;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LikeRepository extends MongoRepository<Like, String> {
    
    public Like findByLikepeople(String likepeople);

    public Like findByParentqnaid(String parentqnaid);

    
}
