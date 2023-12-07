package com.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CompositeType;
import org.hibernate.annotations.NaturalId;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UserL")

public class UserL {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String username;

    @NaturalId
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
    private String address;
    private String phoneNo;
    private Boolean isActive;
}
