package exam;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int money = scanner.nextInt();
		
		System.out.println("50000 �� ¥�� : " + money / unit[0] + "��");
		System.out.println("10000 �� ¥�� : " + money % unit[0] / unit[1] + "��");
		System.out.println("1000 �� ¥�� : " + money % unit[0] % unit[1] / unit[2] + "��");
		System.out.println("500 �� ¥�� : " + money % unit[0] % unit[1] % unit[2] / unit[3] + "��");
		System.out.println("100 �� ¥�� : " + money % unit[0] % unit[1] % unit[2] % unit[3] / unit[4] + "��");
		System.out.println("50 �� ¥�� : " + money % unit[0] % unit[1] % unit[2] % unit[3] % unit[4] / unit[5] + "��");
		System.out.println("10 �� ¥�� : " + money % unit[0] % unit[1] % unit[2] % unit[3] % unit[4] % unit[5] / unit[6] + "��");
		System.out.println("1 �� ¥�� : " + money % unit[0] % unit[1] % unit[2] % unit[3] % unit[4] % unit[5] % unit[6] + "��");
		
		scanner.close();
	}

}
