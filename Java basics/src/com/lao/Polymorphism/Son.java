package com.lao.Polymorphism;

public class Son extends parent {
	
	@Override
	public void marriage() {
		System.out.println("my rules");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent Parent = new Son();//parant class ref = new child class
		Parent.properties();
		Parent.marriage();
		
	}

}
