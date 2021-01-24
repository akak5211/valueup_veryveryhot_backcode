
package com.valueup.veryveryhot.Repository;

import java.util.List;

import com.valueup.veryveryhot.Model.Cardinfo;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CardinfoRepository extends MongoRepository<Cardinfo, String> {
    public List<Cardinfo> findByCompanyname(String companyname);
    public List<Cardinfo> findByRewards(List<String> rewards);
}
