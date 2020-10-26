package com.clough.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.clough.springbootpostgresql.model.Employees;
import com.clough.springbootpostgresql.model.Projects;
import com.clough.springbootpostgresql.service.ProjectsService;

@Controller
public class ProjectsController {
	
	@Autowired
	public ProjectsService projectsService;
	
	@GetMapping("/projects")
	public String getProjects(Model model) {
		List<Projects> projects = projectsService.findAll();
			model.addAttribute("jodi", projects);
		return "project-list";
	}
	
	@GetMapping(value= {"/projects/add"})
	public String showAddProject(Model model) {
		Projects project = new Projects();
		model.addAttribute("add", true);
		model.addAttribute("project", project);
		return "project-add";
		
	}

	@PostMapping(value="/projects/add")
	public String addEmployee(Model model, 
			@ModelAttribute("project")Projects project) {
		try {
			Projects newProject = projectsService.save(project);
			return "redirect:/project-add/" + Long.valueOf(newProject.getPid());
		}
		catch(Exception e) {
			String errorMessage = e.getMessage();
			model.addAttribute("errorMessage", errorMessage);
			model.addAttribute("add", true);
			return "project-add";
		}
	}
}
