package exam;

import java.util.Scanner;

public class Q14_adv {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int intArray[];
		int num;
		int ran;
		ran = (int)(Math.random() * 10 + 1);
		
		System.out.println((double)Math.random());				// 0.xxx ~ 0.9xx
		System.out.println((int)Math.random() * 10);			// 0 ~ 9
		System.out.println((int)Math.random() * 10 + 1);		// 1 ~ 10
		System.out.println((int)Math.random() * 100);		// 0 ~ 99
		System.out.println((int)Math.random() * 100 + 1);	// 1 ~ 100
		
		
		
	
		
		/*
		System.out.print("정수 몇개의 방을 생성할 것입니까? >> ");
		num = scanner.nextInt();
		
		intArray = new int[num];
	
		System.out.print("랜덤한 정수들 : ");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()* 100 + 1);
			System.out.print(intArray[i] + " ");
			sum += intArray[i];
		}
	
		System.out.println();
		System.out.println("평균은 " + (double)sum / intArray.length);
		scanner.close();
		*/
	}

}
