package chapter02;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		double dNum1 = 1.2;
		float fNum2 = 0.9F;						//float�� ���� �ڿ� F�� f�� ����
		
												// ����� ����ȯ. double�� float���� int�� ��ȯ�� 
		int iNum3 = (int)dNum1 + (int)fNum2;	// 1.2 -> 1, 0.9 -> 0���� �ҽ��� �߻���
		int iNum4 = (int)(dNum1 + fNum2);		// 2.1 -> 2�� ���������� �ҽ��� �߻���(double -> int)
		
		System.out.println(iNum3);
		System.out.println(iNum4);

	}

}
