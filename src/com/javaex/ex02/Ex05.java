package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name= sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.println("키를 입력해주세요");
		System.out.print("키:");
		double hei = sc.nextDouble();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 키는 "+hei+" 입니다");
				
		System.out.println("깃 테스트 버전020202");
		System.out.println("깃 테스트 버전0202034");
		System.out.println("깃 테스트 버전0202344");
		sc.close();
	
	}
}
