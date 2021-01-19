package com.valueup.veryveryhot.Repository;

import com.valueup.veryveryhot.Model.Qna;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QnaRepository extends MongoRepository<Qna, String> {
    
    public Qna findByQnatitle(String qnatilte);
    public Qna findByQnapeople(String qnapeople);
    public Qna findByQnacontent(String qnacontent);
    public Qna findByParentid(String parentid);
    public Qna findByLikerate(int likerate);
    public Qna findByQnarate(int qnarate);
    public Qna findByQnadate(String qnadate);

    
}