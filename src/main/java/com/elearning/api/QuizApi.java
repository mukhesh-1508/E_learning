package com.elearning.api;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Quiz;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/quiz")
public interface QuizApi {
    @PostMapping("/addQuiz")
    ResponseDto addQuiz(@RequestBody Quiz quiz);
    @GetMapping("/getAllQuiz")
    ResponseDto getAllQuiz();
    @GetMapping("/getQuiz/{quizId}")
    ResponseDto getQuiz(@PathVariable Long quizId);
}
