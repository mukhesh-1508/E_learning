package com.elearning.repository.service.impl;

import com.elearning.api.EnrollmentApi;
import com.elearning.dto.IsEnrolled;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Course;
import com.elearning.model.Enrollment;
import com.elearning.model.UserL;
import com.elearning.repository.CourseRepo;
import com.elearning.repository.EnrollmentRepo;
import com.elearning.repository.UserRepo;
import com.elearning.repository.service.EnrollmentRepoService;
import com.elearning.service.impl.EnrollmentServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnrollmentRepoServiceIMPL implements EnrollmentRepoService {
    @Autowired
    private EnrollmentRepo enrollmentRepo;
    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private UserRepo userRepo;
    @Override
    public ResponseDto toEnroll(Enrollment enrollment) {
        enrollmentRepo.save(enrollment);
        return new ResponseDto(HttpStatus.OK,"user enrolled","");
    }

    @Override
    public ResponseDto enrolledCourses(Long userId) {
        List<Enrollment> enrollmentList=enrollmentRepo.findAllByUser_UserId(userId);
        List<Course> courseList=new ArrayList<>();
        for(Enrollment enrollment:enrollmentList){
            if(enrollment.getIsEnrolled()) {
                courseList.add(enrollment.getCourse());
            }
        }
        return new ResponseDto(HttpStatus.OK,"user enrolled courses",courseList);
    }

    @Override
    public ResponseDto unEnroll(Long enrollmentId) {
        Enrollment enrollment=enrollmentRepo.findById(enrollmentId).get();
        enrollment.setIsEnrolled(false);
        enrollmentRepo.save(enrollment);

        return new ResponseDto(HttpStatus.OK,"user unEnrolled course","");
    }

    @Override
    public ResponseDto isEnrolled(IsEnrolled isEnrolled) {
        return new ResponseDto(HttpStatus.OK, "user Enrolled this course",        enrollmentRepo.findAllByUser_UserIdAndCourse_CourseId(isEnrolled.getUserId(),isEnrolled.getCourseId()));
    }
}
