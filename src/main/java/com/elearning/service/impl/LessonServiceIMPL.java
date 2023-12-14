package com.elearning.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Lesson;
import com.elearning.repository.service.LessonRepoService;
import com.elearning.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceIMPL implements LessonService {
    @Autowired
    private LessonRepoService lessonRepoService;
    @Override
    public ResponseDto addLesson(Lesson lesson) {
        return lessonRepoService.addLesson(lesson);
    }

    @Override
    public ResponseDto getAllLessons(Long courseId) {
        return lessonRepoService.getAllLessons(courseId);
    }

    @Override
    public ResponseDto getLesson(Long lessonId) {
        return lessonRepoService.getLesson(lessonId);
    }
}
