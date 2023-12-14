package com.elearning.service;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Instructor;
import com.elearning.model.UserL;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    ResponseDto getAllUsers();

    ResponseDto addUser(UserL userL);

    ResponseDto toInstructor(Long userId, Instructor instructor);

    ResponseDto getUserById(Long userId);
}
