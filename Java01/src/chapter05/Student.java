package chapter05;

public class Student {

	int studentID;						// 5~8줄 : 멤버 변수(속성)
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {		// 10~18줄 : 메서드
		System.out.println( studentName + ", " + address); 	//이름, 주소 출력하는 메서드
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {

		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		studentAhn.address = "서울시";
		
		System.out.println(studentAhn.studentName);				// 변수 호출
		System.out.println(studentAhn.getStudentName());		// 메서드 호출
		studentAhn.showStudentInfo();
	}

}
