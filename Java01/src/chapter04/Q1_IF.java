package chapter04;

import java.util.Scanner;

public class Q1_IF {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 2���� �����ڸ� ��ĭ���� �и��Ͽ� �Է��ϼ���: ");
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
			System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
		}
		
		scanner.close();
	}

}

//����
