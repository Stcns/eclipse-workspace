package chapter5.test;

import chapter5.test.Person;

public class Person_test {

	public static void main(String[] args) {
		Person man = new Person();
		man.age = 40;
		man.name = "James";
		man.isMarried = true;
		man.numberOfChideren = 3;
		
		System.out.println("나이는 " + man.age);
		System.out.println("이름은 " + man.name);
		System.out.println("결혼 여부는 " + man.isMarried);
		System.out.println("자녀 수는 " + man.numberOfChideren);
		
		
	}
	
}
