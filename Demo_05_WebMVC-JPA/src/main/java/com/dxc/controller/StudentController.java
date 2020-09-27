package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.dao.StudentRepository;
import com.dxc.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping("showStudentForm")
	public String addStudent() {
		return "showStudentForm";
	}
	@RequestMapping(value="addStudent", method = RequestMethod.POST)
	public String addStudent(Student students) {
		studentRepository.save(students);
		return "home";
	}
	@RequestMapping("getStudent/{id}")
	public ModelAndView getStudent(@RequestParam("id") int id) {
		Student students = studentRepository.findById(id).orElse(new Student());
		ModelAndView modelAndView = new ModelAndView("showStudent");
		modelAndView.addObject("stud", students);
		return modelAndView;
	}

}
