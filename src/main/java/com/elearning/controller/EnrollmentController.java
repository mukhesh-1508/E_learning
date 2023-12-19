package com.elearning.controller;

import com.elearning.api.EnrollmentApi;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Enrollment;
import com.elearning.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentController implements EnrollmentApi {
    @Autowired
    private EnrollmentService enrollmentService;
    @Override
    public ResponseDto toEnroll(Enrollment enrollment) {
        return enrollmentService.toEnroll(enrollment);
    }

    @Override
    public ResponseDto enrolledCourses(Long userId) {
        return enrollmentService.enrolledCourses(userId);
    }

    @Override
    public ResponseDto unEnroll(Long enrollmentId) {
        return enrollmentService.unEnroll(enrollmentId);
    }
}
