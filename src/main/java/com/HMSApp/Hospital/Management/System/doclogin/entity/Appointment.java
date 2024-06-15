package com.HMSApp.Hospital.Management.System.doclogin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointments")

public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(long id, String name, String age, String symptoms, String number) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.symptoms = symptoms;
		this.number = number;
	}

	private String name;
	
	private String age;
	
	private String symptoms;
	
	private String number;

}
