package exam;

import java.util.Scanner;

public class Q13_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.print("금액을 입력하시오 >> ");
		int money = scanner.nextInt();
		
		
		
		System.out.println("50000 원 짜리 : " + money / unit[0] + "개");
		money = money % unit[0];
		System.out.println("10000 원 짜리 : " + money / unit[1] + "개");
		money = money % unit[1];
		System.out.println("1000 원 짜리 : " + money  / unit[2] + "개");
		money = money % unit[2];
		System.out.println("500 원 짜리 : " + money  / unit[3] + "개");
		money = money % unit[3];
		System.out.println("100 원 짜리 : " + money / unit[4] + "개");
		money = money % unit[4];
		System.out.println("50 원 짜리 : " + money / unit[5] + "개");
		money = money % unit[5];
		System.out.println("10 원 짜리 : " + money / unit[6] + "개");
		System.out.println("1 원 짜리 : " + money % unit[6] + "개");
		
		scanner.close();
	}

}
