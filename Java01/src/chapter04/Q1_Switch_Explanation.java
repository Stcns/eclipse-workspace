package chapter04;

import java.util.Scanner;

public class Q1_Switch_Explanation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� 2���� ������(+,-,*,/,%)�� ��ĭ���� �и��Ͽ� �Է��ϼ���: ");
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
				System.out.println("�����ڸ� �߸��Է��ϼ̽��ϴ�.");
				scanner.close();
				return;
		}
		System.out.println("��� ���� " + result + "�Դϴ�.");
		scanner.close();
	}

}
