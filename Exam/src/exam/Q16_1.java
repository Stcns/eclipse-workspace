package exam;

import java.util.Scanner;

public class Q16_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		String name;
		int n;
		
		while (true) {
			System.out.print("과목 이름 >> ");
			name = scanner.next();
			if (course[0].equals(name))
				n = score[0];
			else if (course[1].equals(name))
				n = score[1];
			else if (course[2].equals(name))
				n = score[2];
			else if (course[3].equals(name))
				n = score[3];
			else if (course[4].equals(name))
				n = score[4];
			else if ("그만".equals(name))
				break;
			else {
				System.out.println("없는 과목입니다.");
				continue;
			}
			System.out.println(name + "의 점수는 " + n);
		}
		scanner.close();
	}

}
