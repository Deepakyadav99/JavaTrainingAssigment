package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1 implements Comparator<Main1> {

	private String name;
	private int id;

	public Main1(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Main1() {
		super();
	}

	@Override
	public String toString() {
		return "Main1 [name=" + name + ", id=" + id + "]";
	}

	public int getId() {
		return id;
	}


	public static void main(String[] args) {
	
		List<Main1> studentList = new ArrayList<>();

		studentList.add(new Main1("Deepak", 1));
		studentList.add(new Main1("Sneha", 2));
		studentList.add(new Main1("Aniket", 3));
		studentList.add(new Main1("Kiran", 4));

		
		Collections.sort(studentList, new Main1());

		// Displaying the sorted list
		System.out.println("Sorted list of students by name:");
		for (Main1 student : studentList) {
			System.out.println(student);
		}
	}

	@Override
	public int compare(Main1 o1, Main1 o2) {
		
		return -o1.name.compareTo(o2.name);
	}
}
