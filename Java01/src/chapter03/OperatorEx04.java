package chapter03;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
										// ; 처리 전에 적용
		int lastScore1 = ++gameScore; 	//gameScore값 150이 151이 된 후 lastScore1에 대입됨
		System.out.println(lastScore1);	//151
		System.out.println(gameScore);	//151
		
		int lastScore2 = gameScore--;	//gameScore값 151이 lastScore2에 대입 된 후 150이 됨
		System.out.println(lastScore2);	//151
		System.out.println(gameScore);	//150
	}
}
