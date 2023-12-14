package com.elearning.api;

import com.elearning.dto.ResponseDto;
import com.elearning.model.Lesson;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/lesson")
public interface LessonApi {
    @PostMapping("/addLesson")
    ResponseDto addLesson(@RequestBody Lesson lesson);
    @GetMapping("/getAllLessons/{courseId}")
    ResponseDto getAllLessons(@PathVariable Long courseId);
    @GetMapping("/getLesson/{lessonId}")
    ResponseDto getLesson(@PathVariable Long lessonId);
}
