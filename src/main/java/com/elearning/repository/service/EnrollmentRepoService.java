package com.elearning.repository.service;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Enrollment;
import org.springframework.stereotype.Service;

@Service
public interface EnrollmentRepoService {
    ResponseDto toEnroll(Enrollment enrollment);

    ResponseDto enrolledCourses(Long userId);
}
