package com.elearning.repository;

import com.elearning.model.CourseRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRatingRepo extends JpaRepository<CourseRating,Long> {
}
