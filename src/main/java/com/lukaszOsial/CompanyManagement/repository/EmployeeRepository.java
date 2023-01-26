package com.lukaszOsial.CompanyManagement.repository;

import com.lukaszOsial.CompanyManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
