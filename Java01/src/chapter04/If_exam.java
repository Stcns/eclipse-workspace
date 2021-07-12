package chapter04;

public class If_exam {

	public static void main(String[] args) {

		int score = 55;				//조건문 마다 print문을 넣으면 코드가 길어지므로 합칠 수 있으면 합침
		char grade;
		
		if (score >= 90) {
			grade = 'A';
			System.out.println("당신의 점수는 " + score + "점 입니다. 학점은 " + grade + "입니다.");
		}
		else if (score >= 80) {
			grade = 'B';
			System.out.println("당신의 점수는 " + score + "점 입니다. 학점은 " + grade + "입니다.");
		}
		else if (score >= 70) {
			grade = 'C';
			System.out.println("당신의 점수는 " + score + "점 입니다. 학점은 " + grade + "입니다.");
		}
		else if (score >= 60) {
			grade = 'D';
			System.out.println("당신의 점수는 " + score + "점 입니다. 학점은 " + grade + "입니다.");
		}
		else {
			grade = 'F';
			System.out.println("당신의 점수는 " + score + "점 입니다. 학점은 " + grade + "입니다.");
		}

	}

}
