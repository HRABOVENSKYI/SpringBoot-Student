package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentDAO extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email);

}
