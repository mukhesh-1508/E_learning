package com.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Lesson")

public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lessonId;
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    private String title;
    private String content;
    private Integer orderNo;
}
