package com.clough.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.clough.springbootpostgresql.model.ProjectStatus;

@Repository
public interface ProjectStatusRepository extends JpaRepository<ProjectStatus, Long>{

}
