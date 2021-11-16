package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//월을 입력받아 해당월의 일수를 출력
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch(month) {
			case 1:
				System.out.println("31일 입니다");
				break;
			case 2:
				System.out.println("28일 입니다");
				break;
			case 3:
				System.out.println("31일 입니다");
				break;
			case 4:
				System.out.println("30일 입니다");
				break;
			case 5:
				System.out.println("31일 입니다");
				break;
			case 6:
				System.out.println("30일 입니다");
				break;
			case 7:
				System.out.println("31일 입니다");
				break;
			case 8:
				System.out.println("31일 입니다");
				break;
			case 9:
				System.out.println("30일 입니다");
				break;
			case 10:
				System.out.println("31일 입니다");
				break;
			case 11:
				System.out.println("30일 입니다");
				break;
			case 12:
				System.out.println("31일 입니다");
				break;
			default : 
				System.out.println("다시 입력해주세요");
				break;
			
		}
		
		/*	break가 없는 switch case는 권장하지 않음.
		switch(month) {
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30일 입니다.");
				break;
			case 2:
				System.out.println("28일 입니다.");
			default:
				System.out.println("31일 입니다.");
				break;
		}*/	
		
		/* if문 or연산자 사용
		if ((month==4)||(month==6)||(month==9)||(month==11)) {
			System.out.println("30일 입니다.");
		}else if (month==2) {
			System.out.println("28일 입니다.");
		}else {
			System.out.println("31일 입니다.");
		}
		*/
		
		sc.close();
		
	}

}
