package chapter03;

public class OperatorEx06 {
	
	public static void main(String[] args) {
		
		int gameScore = 150;
		
										// ; �Ŀ� ó��
		int lastScore1 = gameScore++;	//gameScore�� 150�� lastScore1�� ���Ե� �� 151�� ��
		System.out.println(lastScore1);	//150
		System.out.println(gameScore);	//151
		
		int lastScore2 = gameScore--;	//gameScore�� 151�� lastScore2�� ���Ե� �� 150�� ��
		System.out.println(lastScore2);	//151
		System.out.println(gameScore);	//150
	}
	
}
