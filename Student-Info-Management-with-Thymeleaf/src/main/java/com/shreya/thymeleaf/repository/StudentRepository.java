package com.shreya.thymeleaf.repository;


import com.shreya.thymeleaf.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}