package com.valueup.veryveryhot.Repository;

import com.valueup.veryveryhot.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    public User findByName(String name);
    public User findByUserid(String userid);
    public User findByUseridAndPassword(String userid, String password);
}
