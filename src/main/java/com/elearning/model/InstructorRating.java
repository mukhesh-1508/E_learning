package com.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "InstructorRating")
public class InstructorRating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long instructorRatingId;
    @ManyToOne
    @JoinColumn(name = "instructorId")
    private Instructor instructor;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserL user;
    private Double instructorRating;
}
