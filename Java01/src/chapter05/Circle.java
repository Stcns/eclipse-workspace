package chapter05;

public class Circle {
	int radius; 		// ���� ������
	String name;		// ���� �̸�
	
	public Circle() {}	// Circle Ŭ������ �⺻ ������(Ŭ�������� ������ �̸��� �޼ҵ�)
						// (��ǲ �Ű�����)�� {�����}�� ���� ������ : �⺻ ������, �⺻�����ڴ� ������ ����
	
	public double getArea( ) {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;					// ������ �ڷ��� ���۷��� ����; Ŭ������ ��üȭ��Ų �޸𸮸� �Ҵ���� �ν��Ͻ�?
		pizza = new Circle();			// Circle ��ü ����, ���۷��� ������ pizza
		pizza.radius = 10;				// ������ �������� 10���� ����
		pizza.name = "�ڹ� ����";			// ������ �̸��� ����
		double area = pizza.getArea();	// ������ ����(GetArea () �� ȣ���ؼ� area ������ �Ҵ�
		System.out.println(pizza.name + "�� ������ : " + area);
		
		
		Circle donut = new Circle();	// Circle ��ü ����, ���۷��� �̸� donut
		donut.radius = 2;
		donut.name = "�ڹ� ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ : "  + area);
	}

}

// ����ο� ����ο� ���� �ִ� ����