package com.example.mappingProject.Service;


import com.example.mappingProject.Entity.Department;
import com.example.mappingProject.Entity.Employee;
import com.example.mappingProject.Repository.DepartmentRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EmpDepService implements CommandLineRunner {

    private final DepartmentRepository departmentRepo;

    public EmpDepService(DepartmentRepository departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @Override
    public void run(String... args) {
        Department it = new Department("IT", Arrays.asList(
                new Employee("Alice"),
                new Employee("Bob")
        ));

        Department hr = new Department("HR", Arrays.asList(
                new Employee("Eve")
        ));

        departmentRepo.saveAll(Arrays.asList(it, hr));
    }
}

