package com.elearning.service.impl;

import com.elearning.dto.AddTech;
import com.elearning.dto.ResponseDto;
import com.elearning.model.InstructorRating;
import com.elearning.model.InstructorReview;
import com.elearning.repository.service.InstructorRepoService;
import com.elearning.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorServiceIMPL implements InstructorService {
    @Autowired
    private InstructorRepoService instructorRepoService;
    @Override
    public ResponseDto getAllInstructors() {
        return instructorRepoService.getAllInstructors();
    }

    @Override
    public ResponseDto addReview(InstructorReview instructorReview) {
        return instructorRepoService.addReview(instructorReview);
    }

    @Override
    public ResponseDto addRating(InstructorRating instructorRating) {
        return instructorRepoService.addRating(instructorRating);
    }

    @Override
    public ResponseDto getInstructorById(Long id) {
        return instructorRepoService.getInstructorById(id);
    }

    @Override
    public ResponseDto addTech(AddTech addTech) {
        return instructorRepoService.addTech(addTech);
    }
}
