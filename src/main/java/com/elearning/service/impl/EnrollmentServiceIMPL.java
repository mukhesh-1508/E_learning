package com.elearning.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Enrollment;
import com.elearning.repository.service.EnrollmentRepoService;
import com.elearning.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentServiceIMPL implements EnrollmentService {
    @Autowired
    private EnrollmentRepoService enrollmentRepoService;
    @Override
    public ResponseDto toEnroll(Enrollment enrollment) {
        return enrollmentRepoService.toEnroll(enrollment);
    }

    @Override
    public ResponseDto enrolledCourses(Long userId) {
        return enrollmentRepoService.enrolledCourses(userId);
    }

    @Override
    public ResponseDto unEnroll(Long enrollmentId) {
        return enrollmentRepoService.unEnroll(enrollmentId);
    }
}
