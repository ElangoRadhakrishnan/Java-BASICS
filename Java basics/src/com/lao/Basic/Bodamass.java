package com.lao.Basic;
import java.util.Scanner;
public class Bodamass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number A :");
		int A = sc.nextInt();
		System.out.println("Enter the Number B : ");
		int B = sc.nextInt();
		System.out.println("Enter the Number C : ");
		int C =sc.nextInt();
		
		int Sum = (A /B)*C;
		System.out.println("The Bodmass of Number is : "+ Sum);

	}

}
