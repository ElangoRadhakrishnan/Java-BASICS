package com.lao.Abstaction;

public class Benz extends Car{

	@Override
	public void engineScret() {
		System.out.println("Benz car Engine Secret");
	}
	
	@Override
	public void companyvault() {
		System.out.println("Benz Car company vault");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Benz();
		car.engineScret();
		car.companyvault();
		
		

	}

}
