package com.elearning.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Instructor")

public class Instructor {
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "instructorId")
    private UserL user;

    @ElementCollection
    @CollectionTable(name = "instructorTech", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "tech")
    private List<String> tech;
    private Boolean isInstructorActive = true;


}
