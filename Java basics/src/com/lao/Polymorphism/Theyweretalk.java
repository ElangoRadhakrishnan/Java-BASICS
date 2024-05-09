package com.lao.Polymorphism;

public class Theyweretalk {
	public void talk(parents styleOfTalking) {
		System.out.println("Polite Respectfull?.");
		
	}
	public void talk(partner styleOfTalking) {
		System.out.println("Mixture of every thing");
	}
	public void talk(Boss styleOfTalking) {
		System.out.println("Nothing personal");
	}
/// over loading the method name is same passing diffrent arguments or steps..
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theyweretalk t = new Theyweretalk();
		parents Parents = new parents();
		t.talk(Parents);
		
		Boss boss = new Boss();
		t.talk(boss);
		
		partner part = new partner();
		t.talk(part);
	}

}
