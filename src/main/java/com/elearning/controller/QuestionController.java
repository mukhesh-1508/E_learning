package com.elearning.controller;

import com.elearning.api.QuestionApi;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Question;
import com.elearning.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController implements QuestionApi {
    @Autowired
    private QuestionService questionService;

    @Override
    public ResponseDto addQuestion(Question question) {
        return questionService.addQuestion(question);
    }

    @Override
    public ResponseDto getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @Override
    public ResponseDto getQuestionsByQuiz(Long quizId) {
        return questionService.getQuestionsByQuiz(quizId);
    }
}
