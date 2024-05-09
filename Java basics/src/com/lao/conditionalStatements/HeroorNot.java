package com.lao.conditionalStatements;

public class HeroorNot {
	String hero = "CaptainAmerica";
	
	public void heroOrN() {
		switch (hero) {
		case "CaptainAmerica":
			System.out.println("CaptainAmerica is a Super Hero");
			break;
		case "Bat man":
			System.out.println("Bat man is a Super Hero");
			break;
		case "Super man":
			System.out.println("Super man is a Super Hero");
			break;
		default:
			System.out.println(hero + " is not a super hero");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroorNot n = new HeroorNot();
		n.heroOrN();
	}

}
