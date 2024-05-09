package com.lao.Basic;
import java.util.Scanner;
public class OddorEven {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int Number = sc.nextInt();
        
        if(Number %2 == 0) {
        	System.out.println(Number + " It is Even Number ");	
        }
        else {
        	System.out.println(Number + " It is odd Number");
        }
	
	}

}
