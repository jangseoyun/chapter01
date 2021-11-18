package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int dan = sc.nextInt();
		
		int i = 1;
		
		while(i<=9) {
			
			System.out.println(dan+" * "+i+" = "+dan*i);
			i++;
			//다른 연산자 전체 사용 가능하다 마이너스도 사용.
			//i=i+1;  >> if 기본에 5씩 올려라, i=i+5;
		}
		 
		sc.close();

	}

}
