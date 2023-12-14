package com.elearning.controller;

import com.elearning.api.QuizApi;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Quiz;
import com.elearning.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController implements QuizApi {
    @Autowired
    private QuizService quizService;
    @Override
    public ResponseDto addQuiz(Quiz quiz) {
        return quizService.addQuiz(quiz);
    }

    @Override
    public ResponseDto getAllQuiz() {
        return quizService.getAllQuiz();
    }

    @Override
    public ResponseDto getQuiz(Long quizId) {
        return quizService.getQuiz(quizId);
    }
}
