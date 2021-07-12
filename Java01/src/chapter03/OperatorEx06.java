package chapter03;

public class OperatorEx06 {
	
	public static void main(String[] args) {
		
		int gameScore = 150;
		
										// ; 후에 처리
		int lastScore1 = gameScore++;	//gameScore값 150이 lastScore1에 대입된 후 151이 됨
		System.out.println(lastScore1);	//150
		System.out.println(gameScore);	//151
		
		int lastScore2 = gameScore--;	//gameScore값 151이 lastScore2에 대입된 후 150이 됨
		System.out.println(lastScore2);	//151
		System.out.println(gameScore);	//150
	}
	
}
