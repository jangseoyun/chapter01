package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		//논리 연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자  && (엄격하다, f가 하나라도 있으면 f임)
		System.out.println("&&연산자");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		//논리연산자 응용
		System.out.println("&&논리연산자 응용");
		System.out.println((a>b) && (a<b));  //5>7 false && 5<7 true
		System.out.println((a>b)&&(a>b)); //5>7 && 5>7 false
		
		//논리연산자 || (or 연산자로 T 혹은 F시 T)
		System.out.println("||연산자");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		//||연산자 응용
		System.out.println("||연산자 응용");
		System.out.println((a>b)||(a<b)); // 5>7 || 5<7  >>> T
		
		//! (NOT) 연산자 >> 결과값의 반대로 만들어줌
		System.out.println("!연산자");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(a>b); //f
		System.out.println(!(a>b)); //t
		
	}
}
