package com.elearning.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Instructor;
import com.elearning.model.UserL;
import com.elearning.repository.service.UserRepoService;
import com.elearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {
    @Autowired
    private UserRepoService userRepoService;
    @Override
    public ResponseDto getAllUsers() {
        return userRepoService.getAllUsers();
    }

    @Override
    public ResponseDto addUser(UserL userL) {
        return userRepoService.addUser(userL);
    }

    @Override
    public ResponseDto toInstructor(Long userId, Instructor instructor) {
        return userRepoService.toInstructor(userId,instructor);
    }

    @Override
    public ResponseDto getUserById(Long userId) {
        return userRepoService.getUserById(userId);
    }
}
