package com.lao.Staticexample;

public class staticVariable {

	static int accountBalance =0;
	String depositedBy;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVariable object1= new staticVariable();
		object1.accountBalance=1000;
		object1.depositedBy="Agni";
		staticVariable object2= new staticVariable();
		object2.accountBalance=2000;
		object2.depositedBy="Riya";
		System.out.println("object1 integer: "+object1.accountBalance);
		System.out.println("object1 String: "+object1.depositedBy);
		System.out.println("object2 integer: "+object2.accountBalance);
		System.out.println("object2 STring: "+object2.depositedBy);
	}

}
