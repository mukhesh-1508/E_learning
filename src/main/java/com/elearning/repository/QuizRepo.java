package com.elearning.repository;

import com.elearning.model.Quiz;
import com.elearning.repository.service.impl.QuizRepoServiceIMPL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepo extends JpaRepository<Quiz,Long> {
}
