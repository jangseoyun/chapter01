package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
	
		int[] intArray = new int[4];
//		int[] intArray = new int[] {3,7,13,55};
//		int[] intArray = {3,7,13,55};
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 13;
		intArray[3] = 55;
		
//		System.out.println(intArray[1]);
		
		for(int i= 0; i<4; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("===========================");

		for(int i= 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		/*
		for(int i= 0; i<=intArray.length; i++) { //없는 방이 있어서 오류가난다.
			System.out.println(intArray[i]);
		}
		*/

		
		/*
		System.out.println("===========================");

		char[] charArray = new char[3];
		
		charArray[0] = 'A';
		charArray[1] = '한';
		charArray[2] = 'z';
		
		for(int i = 0; i<3; i++) {
			System.out.println(charArray[i]);
		}
		*/
		
		
		
	}

}
