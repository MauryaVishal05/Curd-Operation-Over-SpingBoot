package com.noscrop.crud_demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double percentage;
	private String branch;


	public Student() {
		super();
	}

	public Student(String name, double percentage, String branch) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.branch = branch;
	}
	

	public Student(int id, String name, double percentage, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.branch = branch;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch + "]";
	}
	
	
}
