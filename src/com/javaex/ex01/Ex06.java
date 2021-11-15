package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {
		//강제 형변환 예제 문제//
		double v01 = 5/4;
		System.out.println(v01);
		//1.25 >>> 정답 : 1.0 몫이 중요 나머지는 x 정수 나누기 정수라서
		double v02 = (double)5/4; //  5.0/4
		System.out.println(v02);
		//1.25
		double v03 = 5/(double)4 ;//  5/4.0
		System.out.println(v03);
		//1.25
		double v04 = (double)5/(double)4 ;  //  5.0/4.0
		System.out.println(v04);
		//1.25
		int v05 = (int)1.3 + (int)1.8;  // 1+1
		System.out.println(v05);
		//2
		int v06 = (int)(1.3+1.8); //1.3+1.8을 먼저해줌
		System.out.println(v06); 
		//3
	}
	
}
