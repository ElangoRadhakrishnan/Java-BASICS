package com.lao.Basic;
import java.util.Scanner;
public class SquareofNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Square = sc.nextInt();
		int Root = Square*Square;
		System.out.println("The Square root is : "+ Root);
		sc.close();
	}

}
