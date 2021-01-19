package com.valueup.veryveryhot.DAO;


import com.valueup.veryveryhot.Model.Qna;

import java.util.List;

public interface QnaDAO {
    public List<Qna> getAllQna();

    public Qna getQnaById(String id);

    public Qna getQnaByQnatitle(String qnatitle);

    public Qna getQnaByQnapeople(String qnapeople);

    public Qna getQnaByQnacontent(String qnacontent);

    public Qna getQnaByParentid(String parentid);

    public Qna getQnaByLikerate(int likerate);

    public Qna getQnaByQnarate(int qnarate);

    public Qna getQnaByQnadate(String qnadate);

    public Qna addQna(Qna qna);

    public Qna updateQna(Qna qna);

    public void deleteQna(Qna qna);

    
}
