package com.lao.conditionalStatements;

public class LetsHaveCoffee {

	boolean isCupEmpty=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LetsHaveCoffee coffee = new LetsHaveCoffee();
		
		if(coffee.isCupEmpty) {
			System.out.println("Fill the cup");
		}
		else {
			System.out.println("Drink the Coffe");
		}
	}

}
