package com.clough.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.clough.springbootpostgresql.model.ProjectDepartments;

@Repository
public interface ProjectDepartmentsRepository extends JpaRepository<ProjectDepartments, Long>{

}
