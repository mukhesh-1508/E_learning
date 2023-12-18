package com.elearning.repository.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Course;
import com.elearning.model.Instructor;
import com.elearning.model.UserL;
import com.elearning.repository.CourseRepo;
import com.elearning.repository.InstructorRepo;
import com.elearning.repository.UserRepo;
import com.elearning.repository.service.UserRepoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserRepoServiceIMPL implements UserRepoService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private InstructorRepo instructorRepo;
    @Autowired
    private CourseRepo courseRepo;
    @Override
    public ResponseDto getAllUsers() {
        return new ResponseDto(HttpStatus.OK,"all users",userRepo.findAll());
    }

    @Override
    public ResponseDto addUser(UserL userL) {
        System.out.println(userL);
        userRepo.save(userL);
        return new ResponseDto(HttpStatus.OK,"user added","");
    }

    @Override
    public ResponseDto toInstructor(Long userId, Instructor instructor) {
        UserL userL=userRepo.findById(userId).get();
        userL.setRole("instructor");
        userRepo.save(userL);
        instructor.setUser(userL);
        instructor.setId(userId);
        instructorRepo.save(instructor);


        return new ResponseDto(HttpStatus.OK,"instructor added","");
    }

    @Override
    public ResponseDto getUserById(Long userId) {
        return new ResponseDto(HttpStatus.OK,"user by id", userRepo.findById(userId));
    }
}
