package com.elearning.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Quiz;
import com.elearning.repository.service.QuizRepoService;
import com.elearning.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceIMPL implements QuizService {
    @Autowired
    private QuizRepoService quizRepoService;
    @Override
    public ResponseDto addQuiz(Quiz quiz) {
        return quizRepoService.addQuiz(quiz);
    }

    @Override
    public ResponseDto getAllQuiz() {
        return quizRepoService.getAllQuiz();
    }

    @Override
    public ResponseDto getQuiz(Long quizId) {
        return quizRepoService.getQuiz(quizId);
    }
}
