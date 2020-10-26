package com.clough.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.clough.springbootpostgresql.model.Projects;
import com.clough.springbootpostgresql.model.Time;
import com.clough.springbootpostgresql.service.TimeService;

@Controller
public class TimeController {

	@Autowired
	public TimeService timeService;
	
	@GetMapping("/time")
	public String getTime(Model model) {
	List<Time> time = timeService.findAll();
		model.addAttribute("jodi", time);
	return "timesheet";
	}
	
	@GetMapping(value= {"/time/add"})
	public String showAddTime(Model model) {
		Time time = new Time();
		model.addAttribute("add", true);
		model.addAttribute("time", time);
		return "time-add";
		
	}

		@GetMapping(value="/time/add/{timeid}")
		public String getTimebyId(Model model, @PathVariable Long timeid)
		{
			Time time = null;
			try {
				time = timeService.findById(timeid);
			}catch(Exception e) {
				String errorMessage = e.getMessage();
				model.addAttribute("errorMessage",  "Time entry not found.");
			}
				model.addAttribute("time", time);
				return "time-add";
			}
		
	@PostMapping(value="/time/add")
	public String addTime(Model model, 
			@ModelAttribute("time")Time time) {
		
		try { 
			System.out.println("Post Mapping time");
			Time newTime = timeService.save(time);
			return "redirect:/time/add/" + Long.valueOf(newTime.getTimeid());
		}
		catch(Exception e) {
			String errorMessage = e.getMessage();
			model.addAttribute("errorMessage", errorMessage);
			model.addAttribute("add", true);
			return "time-add";
		}
	}
}
