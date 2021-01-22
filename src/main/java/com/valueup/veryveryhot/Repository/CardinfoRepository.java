
package com.valueup.veryveryhot.Repository;

import java.util.List;

import com.valueup.veryveryhot.Model.Cardinfo;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CardinfoRepository extends MongoRepository<Cardinfo, String> {
    public Cardinfo findByCompanyname(String companyname);
    public Cardinfo findByRewards(List<String> rewards);
    public Cardinfo findByRewards_img(List<String> rewards_img);
}
