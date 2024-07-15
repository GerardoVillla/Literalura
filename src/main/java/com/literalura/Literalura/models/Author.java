package com.literalura.Literalura.models;

import java.util.List;

import com.literalura.Literalura.dto.AuthorDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "authors")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String lastName;
	private int birthDay;
	private int deathDay;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Book book;

	public Author() {
		super();
	}	

	public Author(AuthorDTO data){
		this.name = data.name();
		this.birthDay = data.birthDay();
		this.deathDay = data.deathDay();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public int getDeathDay() {
		return deathDay;
	}

	public void setDeathDay(int deathDay) {
		this.deathDay = deathDay;
	}

	
}


