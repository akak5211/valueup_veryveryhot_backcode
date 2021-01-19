package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Repository.QnaRepository;
import com.valueup.veryveryhot.Model.Qna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class QnaDAOImpl implements QnaDAO{

    @Autowired
    private final QnaRepository QnaRepository;

    public QnaDAOImpl(QnaRepository QnaRepository){
        this.QnaRepository = QnaRepository;
    }

    @Override
    public List<Qna> getAllQna() {
        return QnaRepository.findAll();
    }

    @Override
    public Qna addQna(Qna qna) {
        return QnaRepository.insert(qna);
    }

    @Override
    public Qna updateQna(Qna newqna) {
        return QnaRepository.save(newqna);
    }

    @Override
    public void deleteQna(Qna qna) {
       QnaRepository.delete(qna);
    }

    @Override
    public Qna getQnaById(String id) {
        Optional<Qna> Qna = QnaRepository.findById(id);
        return Qna.get();
    }

    public Qna getQnaByQnatitle(String qnatitle){
        return QnaRepository.findByQnatitle(qnatitle);
    }

    public Qna getQnaByQnapeople(String qnapeople){
        return QnaRepository.findByQnapeople(qnapeople);
    }

    public Qna getQnaByQnacontent(String qnacontent){
        return QnaRepository.findByQnacontent(qnacontent);
    }

    public Qna getQnaByParentid(String parentid){
        return QnaRepository.findByParentid(parentid);
    }

    public Qna getQnaByLikerate(int likerate){
        return QnaRepository.findByLikerate(likerate);
    }

    public Qna getQnaByQnarate(int qnarate){
        return QnaRepository.findByQnarate(qnarate);
    }

    public Qna getQnaByQnadate(String qnadate){
        return QnaRepository.findByQnadate(qnadate);
    }

}






