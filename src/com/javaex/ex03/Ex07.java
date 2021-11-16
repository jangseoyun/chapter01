package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	//조건문 연습문제 -4
	//점수를 입력받아 등급을 표시하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A등급");
		} else if(score>=80) {
			System.out.println("B등급");
		} else if(score>=70) {
			System.out.println("C등급");
		} else if(score>=60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		
		sc.close();
		
		/*if(score>=90) {
			System.out.println("A등급");
		} else if(90>score && score>=80) {
			System.out.println("B등급");
		} else if(80>score && score>=70) {
			System.out.println("C등급");
		} else if(70>score && score>=60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}*/
	}

}
