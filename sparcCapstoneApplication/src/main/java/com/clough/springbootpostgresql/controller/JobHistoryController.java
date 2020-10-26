package com.clough.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.clough.springbootpostgresql.model.Jobhistory;
import com.clough.springbootpostgresql.service.JobHistoryService;

@Controller
public class JobHistoryController {
	
	@Autowired
	public JobHistoryService jobHistoryService;
	
	@GetMapping("/jobhistory")
	public String getJobHistory(Model model) {
		List<Jobhistory> jobHistory = jobHistoryService.findAll();
			model.addAttribute("jodi", jobHistory);
		return "jobhistory-list";
	}

}
