package com.ahmedSoftware.springbackendAPI.repository;

import com.ahmedSoftware.springbackendAPI.domain.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
