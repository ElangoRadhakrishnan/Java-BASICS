package com.lao.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class arrayListExample {
	
	public void arrayList() {
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("BMW");
		arrayList.add("Spura");
		arrayList.add("Bugati");
		arrayList.add("BENz");
		arrayList.add("GTR");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(0));
		
		System.out.println(arrayList.indexOf("GTR"));
		
		//Iterate
		System.out.println("------------------");
		for (String string : arrayList) {
			System.out.println("Using for Each :"+string);
			
			
		}
		System.out.println("------------------");
		for(int i=0 ;i <arrayList.size();i++) {
			
			System.out.println("using for loop : "+ arrayList.get(i));
			
		}
		System.out.println("------------------");
		ListIterator<String> iterator  = arrayList.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------");
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListExample example = new arrayListExample();
		example.arrayList();
	}

}
