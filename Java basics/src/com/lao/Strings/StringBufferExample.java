package com.lao.Strings;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String is imutable");
		
		String name ="Arya";
		
		System.out.println("Appending name in to Orginal "+ name.concat("Parasath"));
		
		System.out.println("Orginal name : "+ name);
		
		System.out.println("************************************");
		
		System.out.println("Stringh buffer in Mutable");
		
		StringBuffer name1 = new StringBuffer("Arya");
		
		System.out.println("Appending name in to Orginal "+ name1.append("Parasath"));
		
		System.out.println("Orginal name : "+ name1);
		
		System.out.println("************************************");
		
		System.out.println("Reaversed String is : " +name1.reverse());
		

	}

}
