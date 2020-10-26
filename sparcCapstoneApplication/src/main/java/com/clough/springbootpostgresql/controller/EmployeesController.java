package com.clough.springbootpostgresql.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clough.springbootpostgresql.service.EmployeesService;
import com.clough.springbootpostgresql.model.Employees;
import com.clough.springbootpostgresql.repository.EmployeesRepository;

@Controller
public class EmployeesController {

	//private final EmployeesRepository employeesrepository;
	
	@Autowired
	public EmployeesService employeeService;
	
	/*@Autowired
	public EmployeesController(EmployeesRepository employeesrepository) {
		this.employeesrepository = employeesrepository;
	}*/
	
	@GetMapping(value = {"/", "index"})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping(value = {"/admin", "admin"})
	public String admin(Model model) {
		return "admin";
	}
	
	@GetMapping(value = {"/reports", "reports"})
	public String reports(Model model) {
		return "report-list";
	}
	
	@GetMapping(value = {"/reports/report", "report"})
	public String report(Model model) {
		return "report";
	}
	
	@GetMapping("/employees")
	public String getEmployees(Model model) {
	List<Employees> employees = employeeService.findAll(); 
			model.addAttribute("jodi", employees);
		return "employee-list";
	}
	
	@GetMapping(value="/employees/{eid}")
	public String getEmployeesById(Model model, @PathVariable long eid)
	{
		Employees employees = null;
		try {
			employees = employeeService.findById(eid);
		}catch(Exception e) {
			String errorMessage = e.getMessage();
			model.addAttribute("errorMessage", "Employee not found.");
			}
			model.addAttribute("jodi", employees);
			return "employees";
		
	}
	
	@GetMapping(value= {"/employees/add"})
	public String showAddEmployee(Model model) {
		Employees employee = new Employees();
		model.addAttribute("add", true);
		model.addAttribute("employee", employee);
		return "employee-edit";
		
	}
	
	@PostMapping(value="/employees/add")
	public String addEmployee(Model model, 
			@ModelAttribute("employee")Employees employee) {
		try {
			Employees newEmployee = employeeService.save(employee);
			return "redirect:/employee-list/" + Long.valueOf(newEmployee.getEid());
		}
		catch(Exception e) {
			String errorMessage = e.getMessage();
			model.addAttribute("errorMessage", errorMessage);
			model.addAttribute("add", true);
			return "employee-edit";
		}
	}
	
	/*@PostMapping("/employees")
	public Employees createEmployee(@Valid @RequestBody Employees employee) {
	 return employeeService.save(employee);
	}*/

}
