package chapter05.circle;

public class Circle {

	int radius; 		// 원의 반지름
	String name;		// 원의 이름
	
	public Circle() {}	// Circle 클래스의 기본 생성자(클래스명과 동일한 이름의 메소드)
						// (인풋 매개변수)도 {실행부}도 없는 생성자 : 기본 생성자, 기본생성자는 생략이 가능
	
	public double getArea( ) {
		return 3.14 * radius * radius;
	}

}

// 선언부만 존재