package com.ahmedSoftware.springbackendAPI.service;

import com.ahmedSoftware.springbackendAPI.domain.Employee;
import com.ahmedSoftware.springbackendAPI.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
   
    private final EmployeeRepository employeeRepository;
    
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public void save(Employee employee){
         employeeRepository.save(employee);
    }
}
