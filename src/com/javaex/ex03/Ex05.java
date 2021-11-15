package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
	//조건문 연습문제 -2
	//8시간까지는 시간당 10,000원 8시간 초과시에는 시간당 1.5배 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt(); 
		int over = (time-8)*15000; //1.5배 초과임금
		
		if(time<=8) {
			System.out.println("임금은 "+(time*10000)+"원 입니다.");
		} else if(time>8) {
			System.out.println("임금은 "+(over+80000)+"원 입니다.");
		} 

		sc.close();
		
	}
}
