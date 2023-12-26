package com.elearning.controller;

import com.elearning.api.UserApi;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Instructor;
import com.elearning.model.UserL;
import com.elearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {
    @Autowired
    private UserService service;
    @Override
    public ResponseDto getAllUsers(){
        return service.getAllUsers();
    }

    @Override
    public ResponseDto getUserById(Long userId) {
        return service.getUserById(userId);
    }


    @Override
    public ResponseDto addUser(UserL userL) {
        return service.addUser(userL);
    }

    @Override
    public ResponseDto toInstructor(Long userId,Instructor instructor) {
        return service.toInstructor(userId,instructor);
    }
}
