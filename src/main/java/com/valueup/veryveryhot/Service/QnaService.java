package com.valueup.veryveryhot.Service;

import com.valueup.veryveryhot.DAO.QnaDAOImpl;
import com.valueup.veryveryhot.Model.Qna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QnaService {

    private final QnaDAOImpl qnaDAO;

    @Autowired
    public QnaService(QnaDAOImpl qnaDAO) {
        this.qnaDAO = qnaDAO;
    }

    public List<Qna> getAllQna(){
        return qnaDAO.getAllQna();
    }

    public Qna getQna(String qna){
        return qnaDAO.getQnaById(qna);
    }
    
    public Qna getQnaByQnatitle(String qnatitle){
        return qnaDAO.getQnaByQnatitle(qnatitle);
    }

    public Qna getQnaByQnapeople(String qnapeople){
        return qnaDAO.getQnaByQnapeople(qnapeople);
    }

    public Qna getQnaByQnacontent(String qnacontent){
        return qnaDAO.getQnaByQnacontent(qnacontent);
    }

    public Qna getQnaByParentid(String parentid){
        return qnaDAO.getQnaByParentid(parentid);
    }

    public Qna getQnaByLikerate(int likerate){
        return qnaDAO.getQnaByLikerate(likerate);
    }

    public Qna getQnaByQnarate(int qnarate){
        return qnaDAO.getQnaByQnarate(qnarate);
    }

    public Qna getQnaByQnadate(String qnadate){
        return qnaDAO.getQnaByQnadate(qnadate);
    }

    public Qna addQna(Qna qna){
        return qnaDAO.addQna(qna);
    }

    public Qna updateQna(Qna qna){
        return qnaDAO.updateQna(qna);
    }

    public void removeQna(String id){
        Qna qna = qnaDAO.getQnaById(id);
        qnaDAO.deleteQna(qna);
    }


}
