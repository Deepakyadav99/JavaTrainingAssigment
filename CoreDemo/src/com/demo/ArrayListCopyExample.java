package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCopyExample {
	public static void main (String[] args) {
	      List<String> zoo = new ArrayList<String>();
	      zoo.add("Zebra");
	      zoo.add("Lion");
	      zoo.add("Tiger");
	      System.out.println("zoo are: "+zoo);
	      List<String> list = new ArrayList<String>();
	      list.add("Hello");
	      list.add("Hi");
	      list.add("World");
	      System.out.println("list are: "+list);
	      Collections.copy(list,zoo); // copying the ArrayList zoo to the ArrayList list
	      System.out.println(list+ " "+zoo);
	      
	   }
	}