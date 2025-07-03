package com.example.mappingProject.Entity;

import jakarta.persistence.*;

@Entity
public class Profile {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    public Profile() {}

    public Profile(String email) {
        this.email = email;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Profile(Long id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

    
}

