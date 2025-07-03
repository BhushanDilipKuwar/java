package com.example.mappingProject.Repository;


import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import com.example.mappingProject.Entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.department.name = :deptName")
    List<Employee> findEmployeesByDepartmentName(@Param("deptName") String deptName);
}
