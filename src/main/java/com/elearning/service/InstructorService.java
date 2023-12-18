package com.elearning.service;

import com.elearning.dto.AddTech;
import com.elearning.dto.ResponseDto;
import com.elearning.model.InstructorRating;
import com.elearning.model.InstructorReview;
import org.springframework.stereotype.Service;

@Service
public interface InstructorService {
    ResponseDto getAllInstructors();

    ResponseDto addReview(InstructorReview instructorReview);

    ResponseDto addRating(InstructorRating instructorRating);

    ResponseDto getInstructorById(Long id);

    ResponseDto addTech(AddTech addTech);

    ResponseDto getRating(Long instructorId);

    ResponseDto getAllReview();

    ResponseDto getReview(Long instructorId);

    ResponseDto getAllRating();
}
