package com.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CourseRating")
public class CourseRating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseRatingId;
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserL user;
    private Double courseRating;
}
