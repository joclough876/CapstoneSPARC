package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clough.springbootpostgresql.model.Departments;
import com.clough.springbootpostgresql.repository.DepartmentsRepository;

@Service
public class DepartmentsService {
	
	@Autowired
	private DepartmentsRepository departmentsRepository;
	
	private boolean existsById(Long id) {
		return departmentsRepository.existsById(id);
	}
public List<Departments> findAll(){
	List<Departments> departments = departmentsRepository.findAll();
	return departments;
}
}
