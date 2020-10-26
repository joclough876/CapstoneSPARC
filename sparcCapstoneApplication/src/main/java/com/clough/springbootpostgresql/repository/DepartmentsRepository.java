package com.clough.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clough.springbootpostgresql.model.Departments;

@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, Long> {

}
