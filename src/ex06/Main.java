package ex06;

public class Main {

	public static void main(String[] args) {

/*		String[] argss = new String[3];
		argss[0] = "장서윤";
		argss[1] = "서윤";
		argss[2] = "윤";
*/
		/*
		for(int i =0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		if(args[0].equals("-version")) {
			System.out.println("ver0.78");
		}else {
			System.out.println("옵션값을 확인해 주세요");
		}

	}

}
