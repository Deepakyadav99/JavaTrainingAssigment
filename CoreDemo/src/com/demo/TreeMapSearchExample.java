package com.demo;

import java.util.TreeMap;

public class TreeMapSearchExample {
	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(1, "One");
		treeMap.put(2, "Two");
		treeMap.put(3, "Three");
		treeMap.put(4, "Four");
		treeMap.put(5, "Five");

		int keyToSearch = 6;

		if (treeMap.containsKey(keyToSearch)) {
			System.out.println("Key " + keyToSearch + " found in the TreeMap. Value: " + treeMap.get(keyToSearch));
		} else {
			System.out.println("Key " + keyToSearch + " not found in the TreeMap.");
		}
	}
}
