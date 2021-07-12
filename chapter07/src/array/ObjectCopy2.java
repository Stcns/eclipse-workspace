package array;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		System.out.println("==bookArray2�� ���� ��==");	// ó���� bookArray2�� ��� �ε����� null�� ������
		for(int i = 0; i < bookArray2.length; i++) {
			System.out.println(bookArray2[i]);
		}
		
		bookArray1[0] = new Book("�¹���", "������");		// bookArray1�� �� �ε����� �� �Ҵ�
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Book("��� �� ���ΰ�", "���ù�");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);	// bookArray1�� ���� �� bookArray2�� ����
		
		System.out.println("==bookArray2�� ������ �� ��==");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("����");	// bookArray1�� �ε���0�� ���� �ٲ�
		bookArray1[0].setAuthor("�ڿϼ�");
		
		System.out.println("=== bookArray1 ===");		// bookArray1�� �ε���0 ���� �ٲ�
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=== bookArray2 ===");		// bookArray2�� �ε���0 ���� ���� �ٲ�
		for(int i = 0; i < bookArray2.length; i++) {	// bookArray1�� �����߱� ������ ���� ���� �ٲ� -> ���� ����
			bookArray2[i].showBookInfo();
		}
		
	}

}
