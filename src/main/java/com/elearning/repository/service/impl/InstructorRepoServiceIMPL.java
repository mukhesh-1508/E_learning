package com.elearning.repository.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.InstructorRating;
import com.elearning.model.InstructorReview;
import com.elearning.repository.InstructorRatingRepo;
import com.elearning.repository.InstructorRepo;
import com.elearning.repository.InstructorReviewRepo;
import com.elearning.repository.service.InstructorRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class InstructorRepoServiceIMPL implements InstructorRepoService {
    @Autowired
    private InstructorRepo instructorRepo;
    @Autowired
    private InstructorReviewRepo instructorReviewRepo;
    @Autowired
    private InstructorRatingRepo instructorRatingRepo;
    @Override
    public ResponseDto getAllInstructors() {
        return new ResponseDto(HttpStatus.OK,"all instructors",instructorRepo.findAll());
    }

    @Override
    public ResponseDto addReview(InstructorReview instructorReview) {
        instructorReviewRepo.save(instructorReview);
        return new ResponseDto(HttpStatus.OK,"review added","");
    }

    @Override
    public ResponseDto addRating(InstructorRating instructorRating) {
        instructorRatingRepo.save(instructorRating);
//        Double sum=0.0;
//        for(InstructorRating instructorRating1: instructorRatingRepo.findAll()){
//            sum+=instructorRating1.getInstructorRating();
//        }
        return new ResponseDto(HttpStatus.OK,"rating added","");
    }

    @Override
    public ResponseDto getInstructorById(Long id) {
        return new ResponseDto(HttpStatus.OK,"instructor by id",instructorRepo.findById(id));
    }
}
