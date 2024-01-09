package com.demo;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardExample {
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        addIntegers(objectList);

        System.out.println("Objects in the list: " + objectList);
    }
}
