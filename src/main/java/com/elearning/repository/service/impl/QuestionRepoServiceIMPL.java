package com.elearning.repository.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Question;
import com.elearning.repository.QuestionRepo;
import com.elearning.repository.service.QuestionRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class QuestionRepoServiceIMPL implements QuestionRepoService {
    @Autowired
    private QuestionRepo questionRepo;
    @Override
    public ResponseDto addQuestion(Question question) {
        questionRepo.save(question);
        return new ResponseDto(HttpStatus.OK,"question is added","");
    }

    @Override
    public ResponseDto getAllQuestions() {
        return new ResponseDto(HttpStatus.OK,"all questions",questionRepo.findAll());
    }

    @Override
    public ResponseDto getQuestionsByQuiz(Long quizId) {
        return new ResponseDto(HttpStatus.OK,"all questions by lessonId",questionRepo.findAllByQuiz_QuizId(quizId));
    }
}
