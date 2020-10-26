package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clough.springbootpostgresql.model.ProjectStatus;
import com.clough.springbootpostgresql.repository.ProjectStatusRepository;

@Service
public class ProjectStatusService {

		@Autowired
		private ProjectStatusRepository projectstatusRepository;
		
		private boolean existsById(Long id) {
			return projectstatusRepository.existsById(id);
		}
	public List<ProjectStatus> findAll(){
		List<ProjectStatus> projectstatus = projectstatusRepository.findAll();
		return projectstatus;
	}
	}
