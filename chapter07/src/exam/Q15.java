package exam;

public class Q15 {

	public static void main(String[] args) {

		int a, b;	// a => 10�� �ڸ�, b => 1�� �ڸ�
		
		for(int i = 1; i <100 ; i++) {
			a=  i / 10;
			b = i % 10;
			if((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)){		// 10�� �ڸ� 1���ڸ� ��� 3,6,9�� ������
				System.out.println(i + "�ڼ� ¦¦");
			}
			else if ((a == 3 || a == 6 || a == 9) && (b != 3 || b != 6 || b != 9)) {	// 10�� �ڸ����� 3,6,9�� ������
				System.out.println(i + "�ڼ� ¦");
			}
			else if ((a != 3 || a != 6 || a != 9) && (b == 3 || b == 6 || b == 9)) {	// 1�� �ڸ����� 3,6,9�� ������
				System.out.println(i + "�ڼ� ¦");
			}
		}
	}

}