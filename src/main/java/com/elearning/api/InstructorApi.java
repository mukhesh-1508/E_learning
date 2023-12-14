package com.elearning.api;

import com.elearning.dto.ResponseDto;
import com.elearning.model.InstructorRating;
import com.elearning.model.InstructorReview;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/instructor")
public interface InstructorApi {
    @GetMapping("/getAllInstructors")
    ResponseDto getAllInstructors();
    @GetMapping("/getInstructorById/{id}")
    ResponseDto getInstructorById(@PathVariable Long id);
    @PostMapping("/addReview")
    ResponseDto addReview(@RequestBody InstructorReview instructorReview);
    @PostMapping("/addRating")
    ResponseDto addRating(@RequestBody InstructorRating instructorRating);

}