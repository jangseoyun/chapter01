package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {

	//누적해서 담을 수 있는 공간 sum 
		
		int sum = 0; // 값을 담아주는 그릇
		
		for(int count = 1; count<=10; count++) {
			sum = sum+count;
			System.out.println(count+" 까지의 합은 "+sum);
		}
		
		System.out.println("1부터 10까지의 정수의 합은 "+sum+" 입니다.");
		
	}
}