package com.elearning.api;

import com.elearning.dto.ResponseDto;
import com.elearning.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/course")
public interface CourseApi {
    @GetMapping("/getAllCourses")
    ResponseDto getAllCourses();
    @GetMapping("/getCourseById/{id}")
    ResponseDto getCourseById(@PathVariable Long id);
    @PostMapping("/addCourse")
    ResponseDto addCourse(@RequestBody Course course);
    @PostMapping("/addReview")
    ResponseDto addReview(@RequestBody CourseReview courseReview);
    @PostMapping("/addRating")
    ResponseDto addRating(@RequestBody CourseRating courseRating);

}
