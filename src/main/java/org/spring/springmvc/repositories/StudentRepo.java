package org.spring.springmvc.repositories;

import org.spring.springmvc.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;


public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findByNameOrderByIdDesc(String name);
}
