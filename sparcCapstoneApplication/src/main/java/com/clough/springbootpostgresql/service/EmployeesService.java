package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;

import com.clough.springbootpostgresql.model.Employees;
import com.clough.springbootpostgresql.repository.EmployeesRepository;



@Service
public class EmployeesService {
	
	@Autowired
	private EmployeesRepository employeeRepository;
	
	private boolean existsById(Long eid) {
		return employeeRepository.existsById(eid);
	}
public List<Employees> findAll(){
	List<Employees> employees = employeeRepository.findAll();
	return employees;
}
public Employees findById(Long eid) throws Exception {

    Employees employees = employeeRepository.findById(eid).orElse(null);

    if(employees == null) {

                throw new Exception("Cannot find Employee with id: " + eid);

    }

    else

                return employees;

}
public Employees save(Employees employee) throws Exception {
	if(!StringUtils.isEmpty(employee.getEfirst_name())) {
		if(employee.getEid() != null && existsById(employee.getEid())) {
			throw new Exception("Contact with id: " + employee.getEid() +
					" already exists");
		}
		return employeeRepository.save(employee);
	} else {
		Exception e = new Exception("Failed to save employee");
		throw e; 
	}
}


public void update(Employees employee) throws Exception {
	if(!StringUtils.isEmpty(employee.getEfirst_name())) {
		if(!existsById(employee.getEid())) {
			throw new Exception("Cannot find Employee with id: " + employee.getEid());
		}
		
		employeeRepository.save(employee);
		
	} else {
		Exception e = new Exception("Failed to save employee");
		throw e;
	}
}

public void deleteById(Long eid) throws Exception {
	if(!existsById(eid)) {
		throw new Exception("Cannot find employee with id: " + eid);
	} else {
		employeeRepository.deleteById(eid);
	}
	}
}


