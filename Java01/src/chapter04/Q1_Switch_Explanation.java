package chapter04;

import java.util.Scanner;

public class Q1_Switch_Explanation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 2개와 연산자(+,-,*,/,%)를 빈칸으로 분리하여 입력하세요: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result = 0;
		String operatorS = scanner.next();
		char operator = operatorS.charAt(0);
		
		switch(operator) {
			case '+' :
				result = num1 + num2; break;
			case '-' :
				result = num1 - num2; break;
			case '*' :
				result = num1 * num2; break;
			case '/' :
				result = num1 / num2; break;
			case '%' :
				result = num1 % num2; break;
			default :
				System.out.println("연산자를 잘못입력하셨습니다.");
				scanner.close();
				return;
		}
		System.out.println("결과 값은 " + result + "입니다.");
		scanner.close();
	}

}
