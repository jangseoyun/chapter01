package com.javaex.ex02;

public class Ex01 {
	public static void main (String[] args) {
		
		//println() print() 차이점
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("안녕");
		System.out.println("하세요");
		System.out.println("------------------");
		
		//println() 사용법
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "장서윤";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println(i);
		System.out.println(d);
		
		System.out.println(str+str);  // 문자열 + 문자열이 가능하다
		System.out.println(str+i); //문자열 + 정수 가능하다
		System.out.println(str+d); //문자열 + 실수 가능하다
		System.out.println(str+c); //문자열 + 문자열 가능하다
		
		//굿모닝 이랑 2345
		String e = " 이랑 "; // 문자열 "부터 공백을 인식한다"
		System.out.println(str+e+i);
		
		System.out.println(i+i); //숫자 계산연산자이기 때문에 합산되어 나온다
		System.out.println(i+d); //자동 형변환된 것
		System.out.println(i-i); // 계산 연산자 모두 사용 가능함
		//**중요 char는 한글자 이상이면 변할 수 있음 
		System.out.println(c+c); //기본자료형 >>>> 코드표에 있는 코드값을 더해준것임  109240
		System.out.println(c+s); 
	
		System.out.println("제이름은 "+name+" 입니다."); //제이름은 장서윤 입니다.
		
		//이스케이프
		System.out.println("안녕'하'세요"); //안녕'하'세요
		System.out.println("안녕\"하\"세요");//안녕"하"세요
		System.out.println("안녕\\하\\세요"); //안녕\하\세요
		System.out.println("안녕\t하\t세요"); //안녕 하 세요
		System.out.println("안녕\n하세요"); //줄바꿈 
		
		
	
	}

}
