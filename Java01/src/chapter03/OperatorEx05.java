package chapter03;

public class OperatorEx05 {
	
	public static void main(String[] args) {
		
		int gameScore = 150;
		
										// ; 후에 처리
		int lastScore1 = gameScore++;	//gameScore값 150이 lastScore1에 대입된 후 151이 됨
		System.out.println(lastScore1);	//150
		System.out.println(gameScore);	//151
		
		int lastScore2 = --gameScore;	//gameScore값 151이 150이 된 후 lastScore2에 대입됨
		System.out.println(lastScore2);	//150
		System.out.println(gameScore);	//150
	}
	
}
