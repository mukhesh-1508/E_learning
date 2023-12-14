package com.elearning.repository.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.*;
import com.elearning.repository.CourseRatingRepo;
import com.elearning.repository.CourseRepo;
import com.elearning.repository.CourseReviewRepo;
import com.elearning.repository.LessonRepo;
import com.elearning.repository.service.CourseRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CourseRepoServiceIMPL implements CourseRepoService {
    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private CourseRatingRepo courseRatingRepo;
    @Autowired
    private CourseReviewRepo courseReviewRepo;
    @Override
    public ResponseDto getAllCourses() {
        return new ResponseDto(HttpStatus.OK,"all courses",courseRepo.findAll());
    }

    @Override
    public ResponseDto getCourseById(Long id) {
        return new ResponseDto(HttpStatus.OK,"all courses",courseRepo.findById(id));
    }

    @Override
    public ResponseDto addCource(Course course) {
        courseRepo.save(course);
        return new ResponseDto(HttpStatus.OK,"course added","");
    }

    @Override
    public ResponseDto addReview(CourseReview courseReview) {
        courseReviewRepo.save(courseReview);
        return new ResponseDto(HttpStatus.OK,"review added","");
    }

    @Override
    public ResponseDto addRating(CourseRating courseRating) {
        courseRatingRepo.save(courseRating);
        return new ResponseDto(HttpStatus.OK,"course rating added","");
    }


}
