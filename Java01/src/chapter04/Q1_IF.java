package chapter04;

import java.util.Scanner;

public class Q1_IF {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개와 연산자를 빈칸으로 분리하여 입력하세요: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		String operatorS = scanner.next();
		char operator = operatorS.charAt(0);
		
		if (operator == '+') {
			System.out.println(num1 + num2);
		}
		else if (operator == '-') {
			System.out.println(num1 - num2);
		}
		else if (operator == '*') {
			System.out.println(num1 * num2);
		}
		else if (operator == '/') {
			System.out.println(num1 / num2);
		}
		else if (operator == '%') {
			System.out.println(num1 % num2);
		}
		else {
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		
		scanner.close();
	}

}

//보류
