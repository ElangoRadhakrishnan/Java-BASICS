package com.lao.Javalearning;
import java.util.Scanner;
public class Bankaccount {
	//Data
	Scanner sc = new Scanner(System.in);
	Long accountNumber = 123990000004L;
	String holderName ="Agni";
	Integer accountBalance=350;
	//Functions 
	public void getBalance () {
	System.out.println("Balance is " +accountBalance);
	System.out.println("Account Number is " +accountNumber );
	System.out.println("Account Holder Name is " + accountBalance);
	}
// Object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount bank=new Bankaccount();
		bank.getBalance();
		
	}

}
