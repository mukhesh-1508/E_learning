package com.elearning.controller;

import com.elearning.api.EnrollmentApi;
import com.elearning.api.LessonApi;
import com.elearning.dto.ResponseDto;
import com.elearning.model.Lesson;
import com.elearning.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonController implements LessonApi {
    @Autowired
    private LessonService lessonService;
    @Override
    public ResponseDto addLesson(Lesson lesson) {
        return lessonService.addLesson(lesson);
    }

    @Override
    public ResponseDto getAllLessons(Long courseId) {
        return lessonService.getAllLessons(courseId);
    }

    @Override
    public ResponseDto getLesson(Long lessonId) {
        return lessonService.getLesson(lessonId);
    }
}
