package com.clough.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.clough.springbootpostgresql.model.Departments;
import com.clough.springbootpostgresql.service.DepartmentsService;

@Controller
public class DepartmentsController {

	@Autowired
	public DepartmentsService departmentsService;
	
	@GetMapping("/departments")
	public String getDepartments(Model model) {
		List<Departments> departments = departmentsService.findAll();
			model.addAttribute("jodi", departments);
		return "department-list";
	}
	
}
