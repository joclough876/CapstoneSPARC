package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clough.springbootpostgresql.model.ProjectTimeAssignment;
import com.clough.springbootpostgresql.repository.ProjectTimeAssignmentRepository;

@Service
public class ProjectTimeAssignmentService {
	
	@Autowired
	private ProjectTimeAssignmentRepository projecttimeassignmentRepository;
	
	private boolean existsById(Long id) {
		return projecttimeassignmentRepository.existsById(id);
	}
public List<ProjectTimeAssignment> findAll(){
	List<ProjectTimeAssignment> projecttimeassignment = projecttimeassignmentRepository.findAll();
	return projecttimeassignment;
}
}
