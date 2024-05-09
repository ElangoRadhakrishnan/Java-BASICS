package com.lao.Basic;

public class Fibinocii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 0, a2 = 1, a3, i, count = 10;
		System.out.println(a1 +" "+ a2);//print 0 and 1
		
		for(i=2; i<count; i++) {
			a3 = a1+a2;
			System.out.println("  " + a3);
			a1 = a2;
			a2 = a3;
	
		}
	}

}
