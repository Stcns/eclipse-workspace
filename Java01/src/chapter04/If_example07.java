package chapter04;

public class If_example07 {

	public static void main(String[] args) {

		int score = 70;
		char grade;
		
		grade = (score >= 90) ? 'A' : 'B';			// 선택이 두가지만 있다면 조건 연산자를 사용할 수 있다.
		
		System.out.println("당신의 점수는 " + score + "이고, 학점은 " + grade + "입니다.");
		
		
	}

}
