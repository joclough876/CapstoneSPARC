package com.clough.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.clough.springbootpostgresql.model.Jobs;
import com.clough.springbootpostgresql.service.JobsService;

@Controller
public class JobsController {
	
	@Autowired
	public JobsService jobsService;
	
	@GetMapping("/jobs")
	public String getJobs(Model model) {
		List<Jobs> jobs = jobsService.findAll();
			model.addAttribute("jodi", jobs);
		return "job-list";
	}

}
