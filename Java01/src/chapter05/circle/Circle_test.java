package chapter05.circle;

import chapter05.circle.Circle;

public class Circle_test {

	public static void main(String[] args) {

		Circle pizza;					// ������ �ڷ��� ���۷���; Ŭ������ ��üȭ��Ų �޸𸮸� �Ҵ���� �ν��Ͻ�?
		pizza = new Circle();			// Circle ��ü ����, ���۷��� �̸� pizza
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

//����θ� ���� ����ΰ� �ִ� chapter05.circle.Circle(FullName)�� import�ؿ�
//chapter05.package �ȿ� circle.package �ȿ� Circle.java ������ �ǹ�