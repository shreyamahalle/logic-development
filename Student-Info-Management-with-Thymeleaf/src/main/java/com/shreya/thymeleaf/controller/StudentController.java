package com.shreya.thymeleaf.controller;

import com.shreya.thymeleaf.model.Student;
import com.shreya.thymeleaf.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/studentManagement")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("students", repo.findAll());
        return "students";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Student student) {
        repo.save(student);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("student", repo.findById(id).orElseThrow());
        return "student-form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}