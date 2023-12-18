package com.elearning.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Course;
import com.elearning.model.CourseRating;
import com.elearning.model.CourseReview;
import com.elearning.model.Lesson;
import com.elearning.repository.CourseRepo;
import com.elearning.repository.service.CourseRepoService;
import com.elearning.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceIMPL implements CourseService {
    @Autowired
    private CourseRepoService courseRepoService;
    @Override
    public ResponseDto getAllCourses() {
        return courseRepoService.getAllCourses();
    }

    @Override
    public ResponseDto getCourseById(Long id) {
        return courseRepoService.getCourseById(id);
    }

    @Override
    public ResponseDto addCourse(Course course) {
        return courseRepoService.addCource(course);
    }

    @Override
    public ResponseDto addReview(CourseReview courseReview) {
        return courseRepoService.addReview(courseReview);
    }

    @Override
    public ResponseDto addRating(CourseRating courseRating) {
        return courseRepoService.addRating(courseRating);
    }

    @Override
    public ResponseDto getRating(Long courseId) {
        return courseRepoService.getRating(courseId);
    }

    @Override
    public ResponseDto getAllRating() {
        return courseRepoService.getAllRating();
    }

    @Override
    public ResponseDto getReview(Long courseId) {
        return courseRepoService.getReview(courseId);
    }

    @Override
    public ResponseDto getAllReview() {
        return courseRepoService.getAllReview();
    }

    @Override
    public ResponseDto getCourseByCategory(String category) {
        return courseRepoService.getCourseByCategory(category);
    }


}
