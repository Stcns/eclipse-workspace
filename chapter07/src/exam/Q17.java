package exam;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		
		String userSelect, comSelect;
		int n;	// 컴퓨터가 랜덤하게 내는 것
		System.out.println("컴퓨터와 게임을 시작합니다.");
		
		do {
			System.out.println("가위, 바위, 보! >> ");
			userSelect = sc.next();
			
			if(userSelect.equals("그만"))
				break;
			n = (int)(Math.random()*3);
			comSelect = str[n];
			
		}while (true);
		
		sc.close();
	}

}
