package com.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Post")
@EntityListeners(AuditingEntityListener.class)

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserL user;
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp postedAt;
    private Boolean isPostActive;
}
