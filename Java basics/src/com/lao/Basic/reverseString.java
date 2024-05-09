package com.lao.Basic;
import java.util.Scanner;
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String name =sc.nextLine();
		
		StringBuilder reverseString= new StringBuilder(name).reverse();
		
		System.out.println(" Reversed String is : " +reverseString);
		
		sc.close();
	}

}
