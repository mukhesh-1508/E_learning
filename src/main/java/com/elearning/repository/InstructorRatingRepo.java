package com.elearning.repository;

import com.elearning.model.Instructor;
import com.elearning.model.InstructorRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRatingRepo extends JpaRepository<InstructorRating,Long> {

    List<InstructorRating> findAllByInstructor_Id(Long instructorId);
}
