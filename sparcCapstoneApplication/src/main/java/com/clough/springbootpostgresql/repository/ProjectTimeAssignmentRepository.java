package com.clough.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.clough.springbootpostgresql.model.ProjectTimeAssignment;

@Repository
public interface ProjectTimeAssignmentRepository extends JpaRepository<ProjectTimeAssignment, Long>{

}
