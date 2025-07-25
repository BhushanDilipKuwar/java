package com.example.mappingProject.Entity;

import com.example.mappingProject.Controller.DepartmentController;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentController department;

    public Employee() {}
    public Employee(String name) {
        this.name = name;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(Department department2) {
		// TODO Auto-generated method stub
		
	}

   
}
