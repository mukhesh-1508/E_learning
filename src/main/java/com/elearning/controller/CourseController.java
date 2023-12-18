package com.elearning.controller;

import com.elearning.api.CourseApi;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Course;
import com.elearning.model.CourseRating;
import com.elearning.model.CourseReview;
import com.elearning.model.Lesson;
import com.elearning.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController implements CourseApi {
    @Autowired
    private CourseService courseService;
    @Override
    public ResponseDto getAllCourses() {
        return courseService.getAllCourses();
    }

    @Override
    public ResponseDto getCourseById(Long id) {
        return courseService.getCourseById(id);
    }

    @Override
    public ResponseDto addCourse(Course course) {
        return courseService.addCourse(course);
    }

    @Override
    public ResponseDto addReview(CourseReview courseReview) {
        return courseService.addReview(courseReview);
    }

    @Override
    public ResponseDto addRating(CourseRating courseRating) {
        return courseService.addRating(courseRating);
    }

    @Override
    public ResponseDto getRating(Long courseId) {
        return courseService.getRating(courseId);
    }

    @Override
    public ResponseDto getAllRating() {
        return courseService.getAllRating();
    }

    @Override
    public ResponseDto getReview(Long courseId) {
        return courseService.getReview(courseId);
    }

    @Override
    public ResponseDto getAllReview() {
        return courseService.getAllReview();
    }

    @Override
    public ResponseDto getCourseByCategory(String category) {
        return courseService.getCourseByCategory(category);
    }


}
