package com.elearning.repository.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.*;
import com.elearning.repository.*;
import com.elearning.repository.service.CourseRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseRepoServiceIMPL implements CourseRepoService {
    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private CourseRatingRepo courseRatingRepo;
    @Autowired
    private CourseReviewRepo courseReviewRepo;
    @Autowired
    private InstructorRepo instructorRepo;
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

    @Override
    public ResponseDto getRating(Long courseId) {
        Double rating=0.0;
        List<CourseRating> list=courseRatingRepo.findAllByCourseCourseId(courseId);
        for(CourseRating courseRating:list){
            rating+=courseRating.getCourseRating();
        }
        return new ResponseDto(HttpStatus.OK,"course rating ",rating/list.size());
    }

    @Override
    public ResponseDto getAllRating() {
        return new ResponseDto(HttpStatus.OK,"course all rating ",courseRatingRepo.findAll());
    }

    @Override
    public ResponseDto getReview(Long courseId) {
        return new ResponseDto(HttpStatus.OK,"course review ",courseReviewRepo.findAllByCourseCourseId(courseId));
    }

    @Override
    public ResponseDto getAllReview() {
        return new ResponseDto(HttpStatus.OK,"course all review ",courseReviewRepo.findAll());
    }

    @Override
    public ResponseDto getCourseByCategory(String category) {
        List<Course>courses=new ArrayList<>();
        for(Course course:courseRepo.findAll()){
            if(course.getCategory().equals(category)){
                courses.add(course);
            }
        }
        return new ResponseDto(HttpStatus.OK,"course by category ",courses);
    }


}
