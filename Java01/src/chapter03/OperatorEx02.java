package chapter03;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		int mathScore = 95;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("��Ż ���� :" + totalScore);	//���ڿ��� ������ +�� ���� ������ �� �ִ�.
		
		double avgScore = (mathScore + engScore) / 2.0;	//�Ҽ����Ʒ��� ���Ե� ��Ȯ�� �� ����� ����
		System.out.println("��� ���� :" + avgScore);		//�ڷ����� double�� ����ϰ� 2.0���� ������.
		
		int mod = mathScore % engScore;
		String ch1 = "���� �������� ";
		System.out.println(ch1 + mod);
	}
	
}
