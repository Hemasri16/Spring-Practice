package com.dxc.demo;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("hi")
	public String helloAction(HttpServletRequest req, HttpServletResponse res) {
		String name=req.getParameter("name");
		HttpSession session =req.getSession();
		session.setAttribute("name", name);
		
		return "hi";
	}
	

}
