package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.clough.springbootpostgresql.model.Employees;
import com.clough.springbootpostgresql.model.Projects;
import com.clough.springbootpostgresql.repository.ProjectsRepository;

@Service
public class ProjectsService {

	@Autowired
	private ProjectsRepository projectsRepository;
	
	private boolean existsById(Long pid) {
		return projectsRepository.existsById(pid);
	}
		public List<Projects> findAll(){
			List<Projects> projects = projectsRepository.findAll();
			return projects;
		}
		
		public Projects findById(Long pid) throws Exception {

		    Projects project = projectsRepository.findById(pid).orElse(null);

		    if(project == null) {

		                throw new Exception("Cannot find project with id: " + pid);

		    }

		    else

		                return project;

		}
		
		public Projects save(Projects project) throws Exception {
			if(!StringUtils.isEmpty(project.getPname())) {
				if(project.getPid() != null && existsById(project.getPid())) {
					throw new Exception("Project with id: " + project.getPid() +
							" already exists");
				}
				return projectsRepository.save(project);
			} else {
				Exception e = new Exception("Failed to save project");
				throw e; 
			}
		}


		public void update(Projects project) throws Exception {
			if(!StringUtils.isEmpty(project.getPname())) {
				if(!existsById(project.getPid())) {
					throw new Exception("Cannot find Project with id: " + project.getPid());
				}
				
				projectsRepository.save(project);
				
			} else {
				Exception e = new Exception("Failed to save project");
				throw e;
			}
		}

		public void deleteById(Long pid) throws Exception {
			if(!existsById(pid)) {
				throw new Exception("Cannot find project with id: " + pid);
			} else {
				projectsRepository.deleteById(pid);
			}
			}
	}
