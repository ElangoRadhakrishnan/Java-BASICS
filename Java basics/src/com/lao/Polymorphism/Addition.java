package com.lao.Polymorphism;

public class Addition {
	int add (int n1,int n2) {
	return n1+ n2;
	}
	int add( int n1,int n2 ,int n3) {
		return n1+n2+n3;
	}
	float add(float n1, float n2) {
		return n1+ n2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		System.out.println(" sum of two numbers " + obj.add(20,21));
		System.out.println("sum of three Numbers " + obj.add(20, 21, 22));
	
	}

}
