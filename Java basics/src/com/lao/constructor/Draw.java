package com.lao.constructor;

public class Draw {
	String draw;

	Draw(){
		System.out.println("Draw object is Created");
	}
	Draw(String toDraw){
		draw = toDraw;
		System.out.println("Drawing" + draw);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Draw draw = new Draw();
//		Draw draw1 = new Draw("circle");

	}

}
