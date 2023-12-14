package com.elearning.service.impl;

import com.elearning.api.QuestionApi;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Question;
import com.elearning.repository.service.QuestionRepoService;
import com.elearning.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceIMPL implements QuestionService {
    @Autowired
    private QuestionRepoService questionRepoService;
    @Override
    public ResponseDto addQuestion(Question question) {
        return questionRepoService.addQuestion(question);
    }

    @Override
    public ResponseDto getAllQuestions() {
        return questionRepoService.getAllQuestions();
    }

    @Override
    public ResponseDto getQuestionsByQuiz(Long quizId) {
        return questionRepoService.getQuestionsByQuiz(quizId);
    }
}
