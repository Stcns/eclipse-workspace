package chapter05;

public class Student {

	int studentID;						// 5~8�� : ��� ����(�Ӽ�)
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {		// 10~18�� : �޼���
		System.out.println( studentName + ", " + address); 	//�̸�, �ּ� ����ϴ� �޼���
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {

		Student studentAhn = new Student();
		studentAhn.studentName = "�ȿ���";
		studentAhn.address = "�����";
		
		System.out.println(studentAhn.studentName);				// ���� ȣ��
		System.out.println(studentAhn.getStudentName());		// �޼��� ȣ��
		studentAhn.showStudentInfo();
	}

}
