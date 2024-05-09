package com.lao.Basic;
import java.util.Scanner;
public class Cube {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		 int N= sc.nextInt();
		 int cube = N*N*N ;
		 System.out.println("The Cube Root is : "+ cube);
		 

	}

}
