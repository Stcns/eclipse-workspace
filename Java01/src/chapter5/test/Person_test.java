package chapter5.test;

import chapter5.test.Person;

public class Person_test {

	public static void main(String[] args) {
		Person man = new Person();
		man.age = 40;
		man.name = "James";
		man.isMarried = true;
		man.numberOfChideren = 3;
		
		System.out.println("���̴� " + man.age);
		System.out.println("�̸��� " + man.name);
		System.out.println("��ȥ ���δ� " + man.isMarried);
		System.out.println("�ڳ� ���� " + man.numberOfChideren);
		
		
	}
	
}
