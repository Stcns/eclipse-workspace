package chapter05;

public class Student_Test {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	public void showStudentInfo() {							// 리턴할 값이 없을때 void를 넣음, 매개변수  x
		System.out.println(studentName + "," + address);
	}
	
	public static int add(int num1, int num2) {					// 인자를 정수형 선언. 변수를 인자로 받음, 매개변수 O
		int result = num1 + num2;								// 리턴할 값이 있을 때 함수 앞에 자료형을 넣어준다.
		return result;
	}
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다. ");
		
	}

}
