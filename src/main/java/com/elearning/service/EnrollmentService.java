package com.elearning.service;

import com.elearning.dto.IsEnrolled;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Enrollment;
import org.springframework.stereotype.Service;

@Service
public interface EnrollmentService {
    ResponseDto toEnroll(Enrollment enrollment);

    ResponseDto enrolledCourses(Long userId);

    ResponseDto unEnroll(Long enrollmentId);

    ResponseDto isEnrolled(IsEnrolled isEnrolled);
}
