package chapter04;

public class If_example03 {

	public static void main(String[] args) {

		int age = 5;
		
		if (age >= 8) {								// 조건이 True일 때, if의 {수행문} 실행
			
			System.out.println("학교에 다닙니다.");
		}
		else {										// 조건이 False일 때, else의 {수행문} 실행
			System.out.println("학교에 다니지 않습니다.");
		}
	}

}
