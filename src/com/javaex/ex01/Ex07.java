package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		// 대입 연산자
		
		int a = 7;  // 오른쪽에 있는것을 왼쪽에 대입
		int b = 2;
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		
		System.out.println(a / b);  // 사람 3.5  몫3 나머지 1 
		System.out.println(a % b); // 나머지를 표시 
		
		//산술 연산자 / %자세히 
		System.out.println("산술연산자");
		System.out.println(7.0/2.0);  //3.5
		System.out.println(7.0%2.0);  //1.0
		
		
		//부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		//증감연산자
		
		System.out.println("증감연산자");	
		System.out.println(a);
		System.out.println(++a); //(1)a를 1올린다-->7>8, (2)a를 출력한다 8
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(--b); //(1)b를 1내린다-->2>1, (2)b를 출력한다 1
		System.out.println(b);
		
		System.out.println(a);  //8
		System.out.println(a++); //(2)a를 1올린다 (1)a를 출력한다 --> 8>9
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(b--); //(1)출력한다 (2)b를 1내린다 
		System.out.println(b);
		
		
	}

}
