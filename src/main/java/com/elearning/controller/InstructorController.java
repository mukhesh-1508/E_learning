package com.elearning.controller;

import com.elearning.api.InstructorApi;
import com.elearning.dto.ResponseDto;
import com.elearning.model.InstructorRating;
import com.elearning.model.InstructorReview;
import com.elearning.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorController implements InstructorApi {
    @Autowired
    private InstructorService service;
    @Override
    public ResponseDto getAllInstructors() {
        return service.getAllInstructors();
    }

    @Override
    public ResponseDto getInstructorById(Long id) {
        return service.getInstructorById(id);
    }

    @Override
    public ResponseDto addReview(InstructorReview instructorReview) {
        return service.addReview(instructorReview);
    }

    @Override
    public ResponseDto addRating(InstructorRating instructorRating) {
        return service.addRating(instructorRating);
    }
}
