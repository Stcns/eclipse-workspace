package exam;

import java.util.Scanner;

public class Q13_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int money = scanner.nextInt();
		
		for(int i = 0; i < unit.length; i++) {
			System.out.println(unit[i] + " �� ¥�� : " + money / unit[i] +"��");
//			System.out.printf("%d �� ¥�� : %d��\n", unit[i], money / unit[i]); �ε� ǥ���� �� �ִ�.
			money %= unit[i];
//			money = money - (money / unit[i]) * unit[i]; �ε� ǥ���� �� �ִ�.
		}
		
		scanner.close();
	}

}
