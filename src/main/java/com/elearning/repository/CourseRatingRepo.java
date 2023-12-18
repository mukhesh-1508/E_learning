package com.elearning.repository;

import com.elearning.model.Course;
import com.elearning.model.CourseRating;
import com.elearning.model.CourseReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRatingRepo extends JpaRepository<CourseRating,Long> {
    List<CourseRating> findAllByCourseCourseId(Long courseId);
}
