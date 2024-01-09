package com.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Student {
	private int id;
	private String name;
	private int age;
	private Date dateOfJoining;

	public Student(int id, String name, int age, Date dateOfJoining) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + '\'' + ", age=" + age + ", dateOfJoining=" + dateOfJoining
				+ '}';
	}

	public static void main(String[] args) {

		Student student1 = new Student(1, "Deepak", 20, new Date());
		Student student2 = new Student(2, "Kiran", 22, new Date());
		Student student3 = new Student(3, "Aniket", 21, new Date());

		// Creating a list to store Student objects
		List<Student> studentList = new ArrayList<>();

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);

		// Iterating through the list and printing each student's details
		System.out.println("List of Students:");
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}