package chapter03;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
										// ; ó�� ���� ����
		int lastScore1 = ++gameScore; 	//gameScore�� 150�� 151�� �� �� lastScore1�� ���Ե�
		System.out.println(lastScore1);	//151
		System.out.println(gameScore);	//151
		
		int lastScore2 = gameScore--;	//gameScore�� 151�� lastScore2�� ���� �� �� 150�� ��
		System.out.println(lastScore2);	//151
		System.out.println(gameScore);	//150
	}
}
