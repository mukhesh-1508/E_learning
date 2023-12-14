package com.elearning.repository;

import com.elearning.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepo extends JpaRepository<Enrollment,Long> {

    List<Enrollment> findAllByUser_UserId(Long user);
}
