package chapter04;

public class Q4_Explanation {

	public static void main(String[] args) {

		int lineCount = 4;			// 출력할 라인 수
		int spaceCount = 3;			// 공백을 처리하는 변수 (별표 왼쪽 오른쪽), 초기값으로 3 
		int starCount = 1;			// 별표를 처리하는 변수 (공백 사이), 초기값으로 1
		
		for (int i = 0; i < lineCount; i++) {			// 라인을 처리하는 for문	
			for (int j = 0; j < spaceCount; j++) {		// 별표 왼쪽의 공백 처리
				System.out.print(' ');
			}
			for (int j = 0; j < starCount; j++) {		// 별표를 처리
				System.out.print('*');
			}
			for (int j = 0; j < spaceCount; j++) {		// 별표 오른쪽의 공백 처리
				System.out.print(' ');
			}
			spaceCount -= 1;
			starCount += 2;
			System.out.println();
		}
		
	}

}
