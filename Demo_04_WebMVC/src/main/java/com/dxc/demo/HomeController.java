package com.dxc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.model.Student;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Student student) {
		System.out.println("Inside action method");
		return "StudentForm";
		
	}
	@RequestMapping(value="dispStudent", method=RequestMethod.POST)
	public ModelAndView dispStudent(Student student) {
		ModelAndView modelAndView=new ModelAndView("dispStudent");
		modelAndView.addObject("stud",student);
		return modelAndView;
		
	}
}