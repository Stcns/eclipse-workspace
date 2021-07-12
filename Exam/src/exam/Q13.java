package exam;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.print("금액을 입력하시오 >> ");
		int money = scanner.nextInt();
		
		System.out.println("50000 원 짜리 : " + money / unit[0] + "개");
		System.out.println("10000 원 짜리 : " + money % unit[0] / unit[1] + "개");
		System.out.println("1000 원 짜리 : " + money % unit[0] % unit[1] / unit[2] + "개");
		System.out.println("500 원 짜리 : " + money % unit[0] % unit[1] % unit[2] / unit[3] + "개");
		System.out.println("100 원 짜리 : " + money % unit[0] % unit[1] % unit[2] % unit[3] / unit[4] + "개");
		System.out.println("50 원 짜리 : " + money % unit[0] % unit[1] % unit[2] % unit[3] % unit[4] / unit[5] + "개");
		System.out.println("10 원 짜리 : " + money % unit[0] % unit[1] % unit[2] % unit[3] % unit[4] % unit[5] / unit[6] + "개");
		System.out.println("1 원 짜리 : " + money % unit[0] % unit[1] % unit[2] % unit[3] % unit[4] % unit[5] % unit[6] + "개");
		
		scanner.close();
	}

}
