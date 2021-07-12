package exam;

import java.util.Scanner;

public class Q17_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		int n = (int)(Math.random()*3);
		String input;
		
		while (true) {
			System.out.print("가위 바위 보! >> ");
			input = scanner.next();
			
			if("그만".equals(input)) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			else if(str[n].equals(input)) {
				System.out.println("사용자 = " + input + " , 컴퓨터 = " + str[n] + " 비겼습니다.");
			}
			else if(str[n].equals("가위")) {
				if(input.equals("바위"))
					System.out.println("사용자 = " + input + " , 컴퓨터 = " + str[n] + " 사용자가 이겼습니다.");
				if(input.equals("보"))
					System.out.println("사용자 = " + input + " , 컴퓨터 = " + str[n] + " 사용자가 졌습니다.");
			}
			else if(str[n].equals("바위")) {
				if(input.equals("가위"))
					System.out.println("사용자 = " + input + " , 컴퓨터 = " + str[n] + " 사용자가 졌습니다.");
				if(input.equals("보"))
					System.out.println("사용자 = " + input + " , 컴퓨터 = " + str[n] + " 사용자가 이겼습니다.");
			}
			else if(str[n].equals("보")) {
				if(input.equals("가위"))
					System.out.println("사용자 = " + input + " , 컴퓨터 = " + str[n] + " 사용자가 이겼습니다.");
				if(input.equals("바위"))
					System.out.println("사용자 = " + input + " , 컴퓨터 = " + str[n] + " 사용자가 졌습니다.");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
		}
		scanner.close();
	}

}
