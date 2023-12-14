package com.elearning.repository.service.impl;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Lesson;
import com.elearning.repository.LessonRepo;
import com.elearning.repository.service.LessonRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class LessonRepoServiceIMPL implements LessonRepoService {
    @Autowired
    private LessonRepo lessonRepo;
    @Override
    public ResponseDto addLesson(Lesson lesson) {
        lessonRepo.save(lesson);
        return new ResponseDto(HttpStatus.OK,"course lesson-"+lesson.getOrderNo()+" is added","");
    }

    @Override
    public ResponseDto getAllLessons(Long courseId) {
        List<Lesson>lessons=new ArrayList<>();
        for(Lesson lesson:lessonRepo.findAll()){
            if(lesson.getCourse().getCourseId().equals(courseId)){
                lessons.add(lesson);
            }
        }
        Collections.sort(lessons, Comparator.comparingInt(Lesson::getOrderNo));

        return new ResponseDto(HttpStatus.OK,"course lessons is added",lessons);
    }

    @Override
    public ResponseDto getLesson(Long lessonId) {
        return new ResponseDto(HttpStatus.OK,"course lessons by id",lessonRepo.findById(lessonId));
    }
}
