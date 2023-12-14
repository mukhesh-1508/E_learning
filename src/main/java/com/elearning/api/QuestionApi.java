package com.elearning.api;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Question;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/question")
public interface QuestionApi {
    @PostMapping("/addQuestion")
    ResponseDto addQuestion(@RequestBody Question question);
    @GetMapping("/getAllQuestions")
    ResponseDto getAllQuestions();
    @GetMapping("/getQuestionsByQuiz/{quizId}")
    ResponseDto getQuestionsByQuiz(@PathVariable Long quizId);
}
