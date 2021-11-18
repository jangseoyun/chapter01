package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		
		int i = 0; //비교할 정수 초기값
		//무한으로 돌려서 탈출을 할경우 (조건식이 성립되지 않을 때)
		while(true) {
			i++;
			
			if(i%6==0 && i%14==0) {
				System.out.println(i);
				break; // 없으면 무한 반복
			}
			
		}

	}

}
