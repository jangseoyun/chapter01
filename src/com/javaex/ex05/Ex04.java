package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = arrA; //주소만 복사
		
		arrB[1] = 10000; //B를 통해서 변경해도 A함께 변경됨(실체는 동일하고 주소만 복사된 것이라서)
		
		for(int i = 0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		/*
		for(int i = 0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}*/
		
	}

}
