package com.elearning.repository;

import com.elearning.model.InstructorRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRatingRepo extends JpaRepository<InstructorRating,Long> {
}
