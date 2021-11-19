package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		/*
		int[] leftArray = new int[] {10,20,30};
		int[] rightArray = new int[] {10,25,30};

		if(leftArray.length == rightArray.length) {
			
			for(int i = 0; i<leftArray.length; i++) {
				if(leftArray[i]==rightArray[i]) {
					System.out.println(i+"번째 값이 같습니다.");
				}else {
					System.out.println(i+"번째 값이 다릅니다.");
				}
			}
			
		}else {
			System.out.println("두배열의 크기가 다릅니다.");
		}
		*/
		
		int[] leftArray = new int[] {10,20,30};
		int[] rightArray = new int[] {10,20,30};
		
		if(leftArray.length == rightArray.length) {//배열의 크기가 같니?
			//각 방의 값이 같니?
			for(int i = 0; i<leftArray.length; i++) {
				
				if(leftArray[i] != rightArray[i]) {
					System.out.println(i+"번째 값이 다릅니다.");
				} //같으면 아무것도 하지 않음 else를 써주면 공백이 생긴다.
			}
			
		}else {
			System.out.println("배열의 크기가 다릅니다.");
		}
	}

}
