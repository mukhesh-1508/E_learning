package com.elearning.service;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Question;
import org.springframework.stereotype.Service;

@Service
public interface QuestionService {
    ResponseDto addQuestion(Question question);

    ResponseDto getAllQuestions();

    ResponseDto getQuestionsByQuiz(Long quizId);
}
