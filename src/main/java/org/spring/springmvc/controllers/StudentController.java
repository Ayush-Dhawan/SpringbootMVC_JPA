package org.spring.springmvc.controllers;

import org.spring.springmvc.models.Student;
import org.spring.springmvc.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
     private StudentRepo repo;

    @GetMapping("/getAll")
    public Model getStudents(Model m) {
        m.addAttribute("students", repo.findAll().toString());
        return m;
    }

    @PostMapping("/add")
    public ModelAndView addStudent(Student student) {
        repo.save(student);
        return new ModelAndView("redirect:/getAll");
    }

    @PostMapping("/byname")
    public Model getByName(@RequestParam  String name, Model m) {
        m.addAttribute("students", repo.find_naam_se(name));
        return m;
    }
}
