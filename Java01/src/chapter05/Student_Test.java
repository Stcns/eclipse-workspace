package chapter05;

public class Student_Test {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	public void showStudentInfo() {							// ������ ���� ������ void�� ����, �Ű�����  x
		System.out.println(studentName + "," + address);
	}
	
	public static int add(int num1, int num2) {					// ���ڸ� ������ ����. ������ ���ڷ� ����, �Ű����� O
		int result = num1 + num2;								// ������ ���� ���� �� �Լ� �տ� �ڷ����� �־��ش�.
		return result;
	}
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		
		System.out.println(num1 + "+" + num2 + "=" + sum + "�Դϴ�. ");
		
	}

}
