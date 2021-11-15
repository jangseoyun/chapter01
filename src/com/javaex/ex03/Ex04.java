package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	//조건문 연습문제 -1 
	//8시간까지는 시간당 10,000원 8시간 초과시 시간당 12,000원
	//근무시간을 입력받아 임금을 계산
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		int over = (time-8)*12000;
		
		if(time<=8) {
			System.out.println("임금은 "+(time*10000)+"원 입니다.");
		} else if(time>8) {
			System.out.println("임금은 "+(over+80000)+"원 입니다.");
		}

		sc.close();
	}

}
