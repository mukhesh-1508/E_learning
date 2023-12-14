package com.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Enrollment")
@EntityListeners(AuditingEntityListener.class)
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long enrollmentId;
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserL user;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp enrolledAt;
    private Boolean isEnrolled=true;
}
