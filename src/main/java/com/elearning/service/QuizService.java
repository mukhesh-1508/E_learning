package com.elearning.service;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Quiz;
import org.springframework.stereotype.Service;

@Service
public interface QuizService {
    ResponseDto addQuiz(Quiz quiz);

    ResponseDto getAllQuiz();

    ResponseDto getQuiz(Long quizId);
}
