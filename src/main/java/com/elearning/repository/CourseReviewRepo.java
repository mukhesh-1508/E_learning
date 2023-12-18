package com.elearning.repository;

import com.elearning.model.CourseReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseReviewRepo extends JpaRepository<CourseReview,Long> {
    List<CourseReview> findAllByCourseCourseId(Long courseId);
}
