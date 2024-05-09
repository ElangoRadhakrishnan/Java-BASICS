package com.lao.constructor;

public class Animal {
//Parameterised Constructor
	String animal_Name;
	String animal_Type;
	Animal (String Name, String Type) {
		
		animal_Name=Name;
		animal_Type= Type;
	}
		public void sayAboutAnimal(){
		System.out.println("Animal name is "+animal_Name+" and type is "+ animal_Type);
		}
		public static void main(String[] args) {

		// TODO Auto-generated method stub
		Animal animal1= new Animal ("Duck", "Omnivores");
		animal1.sayAboutAnimal();
		Animal animal2= new Animal ("Bear", "Omnivores");
		animal2.sayAboutAnimal();
		Animal animal3= new Animal ("Tiger", "Carnivorus");
		animal3.sayAboutAnimal();
	
		}
}
