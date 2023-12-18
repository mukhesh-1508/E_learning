package com.elearning.repository.service.impl;

import com.elearning.dto.AddTech;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Instructor;
import com.elearning.model.InstructorRating;
import com.elearning.model.InstructorReview;
import com.elearning.repository.InstructorRatingRepo;
import com.elearning.repository.InstructorRepo;
import com.elearning.repository.InstructorReviewRepo;
import com.elearning.repository.service.InstructorRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return new ResponseDto(HttpStatus.OK,"rating added","");
    }

    @Override
    public ResponseDto getInstructorById(Long id) {
        return new ResponseDto(HttpStatus.OK,"instructor by id",instructorRepo.findById(id));
    }

    @Override
    public ResponseDto addTech(AddTech addTech) {
        Instructor instructor=instructorRepo.findById(addTech.getInstructorId()).get();
        instructor.getTech().add(addTech.getTech());
        instructorRepo.save(instructor);
        return new ResponseDto(HttpStatus.OK,"tech added to instructor","");
    }

    @Override
    public ResponseDto getRating(Long instructorId) {
        Double rating=0.0;
        List<InstructorRating>list=instructorRatingRepo.findAllByInstructor_Id(instructorId);
        for(InstructorRating instructorRating:list){
            rating+=instructorRating.getInstructorRating();
        }
        return new ResponseDto(HttpStatus.OK,"instructor rating",rating/ list.size());
    }

    @Override
    public ResponseDto getAllReview() {
        return new ResponseDto(HttpStatus.OK,"instructors all review",instructorReviewRepo.findAll());
    }

    @Override
    public ResponseDto getReview(Long instructorId) {
        return new ResponseDto(HttpStatus.OK,"instructor review",instructorReviewRepo.findAllByInstructor_Id(instructorId));
    }

    @Override
    public ResponseDto getAllRating() {
        return new ResponseDto(HttpStatus.OK,"instructor all rating",instructorRatingRepo.findAll());
    }
}
