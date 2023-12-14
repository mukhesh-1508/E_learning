package com.elearning.repository;

import com.elearning.model.Question;
import com.elearning.service.QuestionService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question,Long> {
    List<Question> findAllByQuiz_QuizId(Long quizId);
}
