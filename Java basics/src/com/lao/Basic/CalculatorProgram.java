package com.lao.Basic;
import java.util.Scanner;
public class CalculatorProgram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int num1= sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the operations (+, -, *, /):");
		char operator = sc.next().charAt(0);
		
		int result; 
		
		switch(operator){
		case '+':{
			result = num1 + num2;
		}
		break;
		case '-':{
			result = num1 - num2;
		}
		break;
		case '*':{
			result = num1 * num2;
		}
		break;
		case '/':{
			result = num1 / num2;
		}
		break;
		
		default:{
			System.out.println(" Inavalid Operator...!");
			return;
		}
		
		}
		System.out.println("Result is : "+ result );
	}

}
