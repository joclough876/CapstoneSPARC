package com.clough.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.clough.springbootpostgresql.model.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long>{

}
