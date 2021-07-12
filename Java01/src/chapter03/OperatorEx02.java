package chapter03;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		int mathScore = 95;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("토탈 점수 :" + totalScore);	//문자열과 변수를 +를 통해 연결할 수 있다.
		
		double avgScore = (mathScore + engScore) / 2.0;	//소수점아래가 포함된 정확한 값 출력을 위해
		System.out.println("평균 점수 :" + avgScore);		//자료형을 double로 명시하고 2.0으로 나눈다.
		
		int mod = mathScore % engScore;
		String ch1 = "나눈 나머지값 ";
		System.out.println(ch1 + mod);
	}
	
}
