package com.ahmedSoftware.springbackendAPI.Loader;

import com.ahmedSoftware.springbackendAPI.domain.Employee;
import com.ahmedSoftware.springbackendAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner{
    
    private final EmployeeService employeeService;
    
    @Autowired
    public DatabaseLoader(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    
    
    
    @Override
    public void run(String... args) throws Exception {
    
        this.employeeService.save(new Employee("ahmed","ali","premier test"));
    }
}
