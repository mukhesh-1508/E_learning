package com.elearning.repository.service;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Course;
import com.elearning.model.CourseRating;
import com.elearning.model.CourseReview;
import com.elearning.model.Lesson;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CourseRepoService {
    ResponseDto getAllCourses();

    ResponseDto getCourseById(Long id);

    ResponseDto addCource(Course course);

    ResponseDto addReview(CourseReview courseReview);

    ResponseDto addRating(CourseRating courseRating);

    ResponseDto getRating(Long courseId);

    ResponseDto getAllRating();

    ResponseDto getReview(Long courseId);

    ResponseDto getAllReview();

    ResponseDto getCourseByCategory(String category);
}
