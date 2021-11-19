package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		
		int[] intArrayB = new int[3];
		
		intArrayB[0] = intArray[0];
		intArrayB[1] = intArray[1];
		intArrayB[2] = intArray[2];
	
		
		for(int i = 0; i<intArray.length; i++) {
			intArray[i] = intArrayB[i];
		}
		
		//B의 [1]값 변경
		intArrayB[1] = 100;
		
		for(int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("===================");
		
		for(int i = 0; i<intArrayB.length; i++) {
			System.out.println(intArrayB[i]);
		}
		
		/*
		for(int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		*/	
			
		}
	}


