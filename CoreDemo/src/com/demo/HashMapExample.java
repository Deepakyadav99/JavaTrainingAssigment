package com.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
     
        Map<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(1, "Deepak");
        myHashMap.put(2, "Sneha");
        myHashMap.put(3, "Aniket");
        myHashMap.put(4, "sandeep");
        myHashMap.put(5, "Akshay");
      //  System.out.println("HashMap: " + myHashMap);
        
        for(Map.Entry m : myHashMap.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           }  
    }
}
