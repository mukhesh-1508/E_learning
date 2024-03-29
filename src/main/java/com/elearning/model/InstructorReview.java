package com.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "InstructorReview")
public class InstructorReview {
    @Id
    @GeneratedValue
    private Long instructorReviewId;
    @ManyToOne
    @JoinColumn(name = "instructorId")
    private Instructor instructor;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserL user;
    private String content;

}
