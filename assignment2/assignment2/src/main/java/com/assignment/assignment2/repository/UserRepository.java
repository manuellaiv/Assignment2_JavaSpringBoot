package com.assignment.assignment2.repository;

import com.assignment.assignment2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
