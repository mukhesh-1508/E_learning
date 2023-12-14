package com.elearning.service;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Course;
import com.elearning.model.CourseRating;
import com.elearning.model.CourseReview;
import com.elearning.model.Lesson;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    ResponseDto getAllCourses();

    ResponseDto getCourseById(Long id);

    ResponseDto addCourse( Course course);

    ResponseDto addReview(CourseReview courseReview);

    ResponseDto addRating(CourseRating courseRating);


}
