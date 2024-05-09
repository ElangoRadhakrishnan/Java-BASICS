package com.lao.Map;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <Integer , String> employeeMap =new HashMap<Integer, String>();
		//To Insert a Elemnt PUT Method
		employeeMap.put(1, "Arul");
		employeeMap.put(2, "Bala");
		employeeMap.put(3, "Cathy");
		employeeMap.put(4, "Dhuruv");
		employeeMap.put(5, "Ezhil");
		
		System.out.println("Employee Map :" + employeeMap);
		
		// To Make a Copy of the Existing map
		Map<Integer , String> duplicateMap = new HashMap<Integer, String>();
		
		duplicateMap.putAll(employeeMap);
		
		System.out.println("Duplicate map :" + duplicateMap);
		
		
		//clear to delete Map contents
		
		duplicateMap.clear();
		System.out.println("After clearing :"+ duplicateMap);
		
		//To check if a Key is Present or not in a Map
		System.out.println("Does Map Has Key 1? "+ employeeMap.containsKey(1));
		
		
		// To check the value is Contain or Not
	
		System.out.println("Does the value in Map contains or Not :" +employeeMap.containsValue("Dilli"));
		
		//  clone the Map 
		System.out.println("Cloned Map "+employeeMap.clone());
		
		//Check if the Map is Empty or Not
		System.out.println("IS Empty? "+duplicateMap.isEmpty());
		
		//
	} 

}
