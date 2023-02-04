package edu.miu.cs.cs425.mystudentmgmtapp.controller;

import edu.miu.cs.cs425.mystudentmgmtapp.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/secured/student/list") //route (url)
    public ModelAndView displayStudents(){
        var modelAndView = new ModelAndView();
        var students = studentService.getAllStudents();
        modelAndView.addObject("students",students);
        modelAndView.setViewName("secured/student/list"); //logical name of the view
        return modelAndView;
    }

}
