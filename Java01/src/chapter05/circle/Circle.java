package chapter05.circle;

public class Circle {

	int radius; 		// ���� ������
	String name;		// ���� �̸�
	
	public Circle() {}	// Circle Ŭ������ �⺻ ������(Ŭ������� ������ �̸��� �޼ҵ�)
						// (��ǲ �Ű�����)�� {�����}�� ���� ������ : �⺻ ������, �⺻�����ڴ� ������ ����
	
	public double getArea( ) {
		return 3.14 * radius * radius;
	}

}

// ����θ� ����