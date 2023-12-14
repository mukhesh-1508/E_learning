package com.elearning.repository.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Quiz;
import com.elearning.repository.QuizRepo;
import com.elearning.repository.service.QuizRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class QuizRepoServiceIMPL implements QuizRepoService {
    @Autowired
    private QuizRepo quizRepo;
    @Override
    public ResponseDto addQuiz(Quiz quiz) {
        quizRepo.save(quiz);
        return new ResponseDto(HttpStatus.OK,"quiz added","");
    }

    @Override
    public ResponseDto getAllQuiz() {
        return new ResponseDto(HttpStatus.OK,"all quiz",quizRepo.findAll());
    }

    @Override
    public ResponseDto getQuiz(Long quizId) {
        return new ResponseDto(HttpStatus.OK,"quiz by id",quizRepo.findById(quizId));
    }
}
