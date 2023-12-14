package com.elearning.repository.service;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Quiz;
import org.springframework.stereotype.Service;

@Service
public interface QuizRepoService {
    ResponseDto addQuiz(Quiz quiz);

    ResponseDto getAllQuiz();

    ResponseDto getQuiz(Long quizId);
}
