package org.spring.springmvc.repositories;

import org.spring.springmvc.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


    public interface StudentRepo extends JpaRepository<Student, Integer> {
//        List<Student> findByNameOrderByIdDesc(String name); //query dsl

        @Query("from Student WHERE name = :stud_name")
        List<Student> find_naam_se(@RequestParam String stud_name);
    }
