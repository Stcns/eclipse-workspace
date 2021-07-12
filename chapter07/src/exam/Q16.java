package exam;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88,76, 62, 55};
		
		String name = "";
		int i = 0;
		
		while(true) {
			System.out.print("과목 이름을 입력하세요 >> ");
			name = sc.next();
			if(name.equals("그만"))
				break;
			for(i = 0; i < course.length; i++) {	// 입력한 값과 array 값이 일치 하지 않으면 for문을 끝까지 시행하고
				if(course[i].equals(name)) {		// for문이 끝났을때 i가 course.length인 5가 된다.
					System.out.println(course[i] + "의 점수는 " + score[i]);
					break;
				}
			}
			if (i == course.length) {				// 즉 i가 5가 되었다(course.length와 같아졌다)는건 없는 과목이라는 의미
				System.out.println("없는 과목입니다.");
				
			}
			
			
		}
		
	}

}
