package com.elearning.api;

import com.elearning.dto.IsEnrolled;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Enrollment;
import com.elearning.service.EnrollmentService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/enrollment")
public interface EnrollmentApi {

    @PostMapping("/toEnroll")
    ResponseDto toEnroll(@RequestBody Enrollment enrollment);
    @GetMapping("/enrolledCourses/{userId}")
    ResponseDto enrolledCourses(@PathVariable Long userId);
    @PostMapping("/unEnroll/{enrollmentId}")
    ResponseDto unEnroll(@PathVariable Long enrollmentId);
    @GetMapping("/isEnrolled")
    ResponseDto isEnrolled(@RequestBody IsEnrolled isEnrolled);
}
