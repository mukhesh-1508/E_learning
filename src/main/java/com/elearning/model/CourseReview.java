package com.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courseReview")
public class CourseReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseReviewId;
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserL user;
    private String content;
}
