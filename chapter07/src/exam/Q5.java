package exam;

public class Q5 {

	public static void main(String[] args) {

		int sum = 0;
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		
		//int scores[] = {1,2,3,4,5,6,7,8,9,10};				// ���ȣ�� �ڷ����̳� ���� �ڿ� �ƹ����� �־ ����
		//int scores[] = new int[] {1,2,3,4,5,6,7,8,9,10};		// �ٸ� array ���� ���
		//int scores[] = new int[10]							// �ε����� 10�� ����. ���� �⺻��(������ 0, �Ǽ��� 0.0, ���ڿ��� null, �������� false ��)
		//scores[0] = 1; ���� ������ ���� �ε����� �־��� �� �ִ�.
		
		//int scores[] =  new int[10] {1,2,3,4,5,6,7,8,9,10}; // ���� �߻�
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("1���� 10������ ���� : " + sum);
		System.out.println(scores.length);
		
	}

}