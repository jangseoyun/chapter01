package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		int num; 
		int sum = 0; //do안에 넣으면 한바퀴 돌때마다 초기화되어 0이된다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		//반복구간--
		do {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계: "+sum);
		}while(num != 0); //0이 아니면 계속 계산
		//반복구간--
		
		System.out.println("종료");
		
		sc.close();
		
	}
}
	
	/*
		 System.out.println("숫자를 입력하세요.[0이면 종료]");
			
			int sum = 0;
			
			while(true) {
	
			int num = sc.nextInt();
				sum = sum + num;
			
				if(num!=0) {
					System.out.println("합계: "+sum);
				}else {
					System.out.println("종료");
					break;
				}
	
			}
	 */
	
	/*//while문은 true + 코드 + if로 탈출구 만들어주는 틀 
	 * 
	 * int num ;
	 * int sum ;
	 * 
		while(true) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계: "+sum);
			
			if(num == 0) { //num 0 이면 끝 -->while문을 나가라 -->break;
				break;
			}
		}
	*/


