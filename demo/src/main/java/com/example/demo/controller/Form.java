package com.example.demo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Form implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Person> persons = new ArrayList<Person>();

	@NotNull
	@Size(min = 1, max = 6)
	private String name;

	private int age;
	
	@NotBlank
    private String gender;

	public List<Person> getPersons() {
		return this.persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

  Form() {
    // this.name = "hoge";
    // this.age = 18;
  }
}