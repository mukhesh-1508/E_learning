package com.elearning.repository;

import com.elearning.model.UserL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserL,Long> {
}
