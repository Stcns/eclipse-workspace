package chapter04;

import java.util.Scanner;

public class Q1_Switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 2개와 연산자(+,-,*,/,%)를 빈칸으로 분리하여 입력하세요: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		String operator = scanner.next();
		
		switch(operator) {
			case "+" :
				System.out.println(num1 + num2); break;
			case "-" :
				System.out.println(num1 - num2); break;
			case "*" :
				System.out.println(num1 * num2); break;
			case "/" :
				System.out.println(num1 / num2); break;
			case "%" :
				System.out.println(num1 % num2); break;
			default :
				System.out.println("연산자를 잘못입력하셨습니다.");
		}
	
		scanner.close();
	}

}
