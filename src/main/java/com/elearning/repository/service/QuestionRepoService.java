package com.elearning.repository.service;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Question;
import org.springframework.stereotype.Service;

@Service
public interface QuestionRepoService {
    ResponseDto addQuestion(Question question);

    ResponseDto getAllQuestions();

    ResponseDto getQuestionsByQuiz(Long quizId);
}
