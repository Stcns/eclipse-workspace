package chapter04;

import java.util.Scanner;

public class Q1_IF_Explanation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	// 객체 생성
		
		System.out.println("정수 2개와 연산자(+,-,*,/,%)를 빈칸으로 분리하여 입력하세요: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result = 0;
		String S = scanner.next();					// 입력받은 문자열 값을 String으로 S 변수에 할당
		char operator = S.charAt(0);				// 문자열 중 첫번째 문자를 char 형인 operator 에 저장
		
		if (operator == '+') {
			result = num1 + num2;
		}
		else if (operator == '-') {
			result = num1 - num2;
		}
		else if (operator == '*') {
			result = num1 * num2;
		}
		else if (operator == '/') {
			result = num1 / num2;
		}
		else if (operator == '%') {
			result = num1 % num2;
		}
		else {
			System.out.println("연산자 오류입니다.");
			scanner.close();
			return;
		}
		System.out.println("결과 값은 " + result + "입니다.");
		scanner.close();
		
	}

}

