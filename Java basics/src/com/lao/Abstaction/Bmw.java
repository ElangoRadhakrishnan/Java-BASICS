package com.lao.Abstaction;

public class Bmw extends Car{
	
	@Override
	public void engineScret() {
		System.out.println("BMW car Engine Secret");
	}
	
	@Override
	public void companyvault() {
		System.out.println("BMW Car company vault");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Bmw();//base class refrenced through current class
		car.engineScret();
		car.companyvault();
	}



}
