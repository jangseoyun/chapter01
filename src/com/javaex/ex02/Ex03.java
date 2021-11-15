package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\"이름\"을 입력해 주세요");
		System.out.print("이름:");
		
		String name = sc.nextLine();
		
//		System.out.println("당신의 이름은 "+name+" 입니다.");
		
		System.out.println("\"나이\"를 입력해 주세요");
		System.out.print("나이:");
		
		int age = sc.nextInt();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다.");
		
		
		
		sc.close();
		
	}
}
