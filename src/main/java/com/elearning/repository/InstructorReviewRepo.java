package com.elearning.repository;

import com.elearning.model.InstructorReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorReviewRepo extends JpaRepository<InstructorReview,Long> {
    List<InstructorReview> findAllByInstructor_Id(Long instructorId);
}
