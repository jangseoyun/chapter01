package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean action = true;
		
		while(action) { //true
			
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(num==0) {
				System.out.println("종료");
				action=false; //break; break를 하면 반복문 전체를 빠져나가는 것이고 false로 지정한것은 else마지막까지 가는것 (진행). 
			}else if(num%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			} //action이면 여기로 오는 것
			
		}

			/*
			if(num%3==0 && num!=0) {
				System.out.println("3의 배수입니다.");
			}else if(num%3!=0 && num!=0){
				System.out.println("3의 배수가 아닙니다.");
			}else {
				System.out.println("종료");
				break;
			}
			*/
		
		sc.close();

	}

}
