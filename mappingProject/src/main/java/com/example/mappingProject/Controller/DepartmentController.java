package com.example.mappingProject.Controller;


import org.springframework.web.bind.annotation.*;

import com.example.mappingProject.Entity.Department;
import com.example.mappingProject.Entity.Employee;
import com.example.mappingProject.Repository.DepartmentRepository;
import com.example.mappingProject.Repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    private final DepartmentRepository departmentRepo;
    private final EmployeeRepository employeeRepo;

    public DepartmentController(DepartmentRepository departmentRepo, EmployeeRepository employeeRepo) {
        this.departmentRepo = departmentRepo;
        this.employeeRepo = employeeRepo;
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    @GetMapping("/employees/by-department")
    public List<Employee> getEmployeesByDepartmentName(@RequestParam String name) {
        return employeeRepo.findEmployeesByDepartmentName(name);
    }
}

