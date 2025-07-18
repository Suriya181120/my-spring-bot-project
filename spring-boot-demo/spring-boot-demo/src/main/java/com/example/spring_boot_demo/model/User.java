package com.example.spring_boot_demo.model;

public class User {

	private Long id;
	private String name;
	private String gmail;
	public User(Long id, String name, String gmail) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
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
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
}
