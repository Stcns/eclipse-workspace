package chapter05.circle;

import chapter05.circle.Circle;

public class Circle_test {

	public static void main(String[] args) {

		Circle pizza;					// 참조형 자료형 레퍼런스; 클래스를 객체화시킨 메모리를 할당받은 인스턴스?
		pizza = new Circle();			// Circle 객체 생성, 레퍼런스 이름 pizza
		pizza.radius = 10;				// 피자의 반지름을 10으로 설정
		pizza.name = "자바 피자";			// 피자의 이름을 설정
		double area = pizza.getArea();	// 피자의 면적(GetArea () 를 호출해서 area 변수에 할당
		System.out.println(pizza.name + "의 면적은 : " + area);
		
		
		Circle donut = new Circle();	// Circle 객체 생성, 레퍼런스 이름 donut
		donut.radius = 2;
		donut.name = "자바 도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 : "  + area);
	}

}

//실행부만 존재 선언부가 있는 chapter05.circle.Circle(FullName)을 import해옴
//chapter05.package 안에 circle.package 안에 Circle.java 파일을 의미