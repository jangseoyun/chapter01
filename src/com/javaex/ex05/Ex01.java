package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
//		int n01 = (int)(Math.random()*45)+1;
//		int n02 = (int)(Math.random()*45)+1;
//		int n03 = (int)(Math.random()*45)+1;
//		int n04 = (int)(Math.random()*45)+1;
//		int n05 = (int)(Math.random()*45)+1;
//		int n06 = (int)(Math.random()*45)+1;
		
		/*
		System.out.println(n01);
		System.out.println(n02);
		System.out.println(n03);
		System.out.println(n04);
		System.out.println(n05);
		System.out.println(n06);
		*/

		/*
		ball[0] = (int)(Math.random()*45)+1;
		ball[1] = (int)(Math.random()*45)+1;
		ball[2] = (int)(Math.random()*45)+1;
		ball[3] = (int)(Math.random()*45)+1;
		ball[4] = (int)(Math.random()*45)+1;
		ball[5] = (int)(Math.random()*45)+1;
		*/
		
		int[] ball = new int[6];  //각 호에 값이 들어가기 전 , 공간만 잡은 것
		
		for (int i = 0; i<6; i++) {
			
			ball[i] = ((int)(Math.random()*45))+1;
		}
		
		for (int i = 0; i<6; i++) {
			
			System.out.println(ball[i]);
			
		}
		
		
	}

}
