package com.literalura.Literalura.models;

import java.util.Arrays;
import java.util.List;

import com.literalura.Literalura.dto.BookDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String title;
	@Enumerated(EnumType.STRING)
	List <Language> languages;
	private double downloads;
	@OneToMany(mappedBy = "books", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Author> authors;
	
	public Book() {
		super();
	}

	public Book(BookDTO data){
		this.title = data.title();
		this.languages = data.languages();
		this.downloads = data.downloads();
		this.authors = data.authors();
	}
	/* 
	public List<Language> deserializeLanguages(String languages){
		return Arrays.asList(languages.split(","));
	}	
	*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getDownloads() {
		return downloads;
	}

	public void setDownloads(double downloads) {
		this.downloads = downloads;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List <Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List <Language> languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", languages=" + languages + ", downloads=" + downloads
				+ ", authors=" + authors + "]";
	}

	
}
