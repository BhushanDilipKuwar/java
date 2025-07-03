package com.example.mappingProject.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mappingProject.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> { }