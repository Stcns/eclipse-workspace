package chapter04;

import java.util.Scanner;

public class Q1_Switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 2���� ������(+,-,*,/,%)�� ��ĭ���� �и��Ͽ� �Է��ϼ���: ");
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
				System.out.println("�����ڸ� �߸��Է��ϼ̽��ϴ�.");
		}
	
		scanner.close();
	}

}
