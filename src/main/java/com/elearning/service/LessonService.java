package com.elearning.service;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Lesson;
import org.springframework.stereotype.Service;

@Service
public interface LessonService {
    ResponseDto addLesson(Lesson lesson);

    ResponseDto getAllLessons(Long courseId);

    ResponseDto getLesson(Long lessonId);
}
