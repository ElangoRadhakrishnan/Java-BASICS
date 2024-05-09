package com.lao.Javalearning;

public class collectedAmount {
	public Integer collectAm = 1000;
	
	public Integer collectAmountAndGive() {
		System.out.println("Collected Ruppes "+collectAm +" Sent it to you daddy");
		return collectAm;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collectedAmount mySon= new collectedAmount();
		Integer amount = mySon.collectAmountAndGive();
		System.out.println("Got the amount my son" + amount);
		

	}

}
