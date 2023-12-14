package com.elearning.api;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Instructor;
import com.elearning.model.UserL;
import com.elearning.repository.service.impl.InstructorRepoServiceIMPL;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/user")
public interface UserApi {
    @GetMapping("/getAllUsers")
    ResponseDto getAllUsers();
    @GetMapping("/getUserById/{userId}")
    ResponseDto getUserById(@PathVariable Long userId);
    @PostMapping("/addUser")
    ResponseDto addUser(@RequestBody UserL userL);
    @PostMapping("/toInstructor/{userId}")
    ResponseDto toInstructor(@PathVariable Long userId, @RequestBody Instructor instructor);
}
