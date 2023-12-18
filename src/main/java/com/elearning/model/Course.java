package com.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Course")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;
    private String courseName;
    private String description;
    private Double price;
    private String category;
    @ManyToOne
    @JoinColumn(name = "instructorId")
    private Instructor instructor;
    private Boolean courseActive=true;

}
