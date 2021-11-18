package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		
		int tail = 3;
		int i = 0;
		
		/*while(i<5) { //tail은 i와 동일한 작업을 함, 뒤에 3부터 시작될 때는 따로 이름을 줌 
			
			System.out.println("i like java"+tail);
			i++;
			tail++;
		}*/
		
		while(i<5) { //기준값과 뒤 꼬리값이 동일할때는 같이 사용할 수 있음
			
			System.out.println("i like java"+i);
			i++;
			
		}
		
	}

}
