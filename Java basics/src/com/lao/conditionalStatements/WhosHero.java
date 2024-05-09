package com.lao.conditionalStatements;

public class WhosHero {
	String myHero= "Captian America";
	public void superHeroGuess() {
		if(myHero.equals("Iornman")) {
			System.out.println("You thought about Iornman");
		}else if(myHero.equals("Superman")) {
			System.out.println("You thougth about Superman");
		}else if(myHero.equals("CaptianAmerica")){
			System.out.println("you thought about CaptainAmerica");
		}else {
			System.out.println("Sorry icant Guess");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhosHero hero = new WhosHero();
		hero.superHeroGuess();
		
	}

}
