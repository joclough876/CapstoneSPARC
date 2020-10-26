package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clough.springbootpostgresql.model.ProjectDepartments;
import com.clough.springbootpostgresql.repository.ProjectDepartmentsRepository;

@Service
public class ProjectDepartmentService {

		
		@Autowired
		private ProjectDepartmentsRepository projectdepartmentsRepository;
		
		private boolean existsById(Long id) {
			return projectdepartmentsRepository.existsById(id);
		}
	public List<ProjectDepartments> findAll(){
		List<ProjectDepartments> projectdepartments = projectdepartmentsRepository.findAll();
		return projectdepartments;
	}
	}