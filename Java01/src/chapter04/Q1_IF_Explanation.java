package chapter04;

import java.util.Scanner;

public class Q1_IF_Explanation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	// ��ü ����
		
		System.out.println("���� 2���� ������(+,-,*,/,%)�� ��ĭ���� �и��Ͽ� �Է��ϼ���: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result = 0;
		String S = scanner.next();					// �Է¹��� ���ڿ� ���� String���� S ������ �Ҵ�
		char operator = S.charAt(0);				// ���ڿ� �� ù��° ���ڸ� char ���� operator �� ����
		
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
			System.out.println("������ �����Դϴ�.");
			scanner.close();
			return;
		}
		System.out.println("��� ���� " + result + "�Դϴ�.");
		scanner.close();
		
	}

}

