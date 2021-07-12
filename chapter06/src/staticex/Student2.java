package staticex;

public class Student2 {

	private static int serialNum = 1000;
		// 외부 클래스에서 접근 차단,
		// setter에서 변수값 할당, getter에서 값을 가지고 온다.
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;		// 스텍 영역에 저장,
						// 메소드가 실행이 끝나면 소멸
		// studentName = "aaa";		// 오류 남
		// static 메소드에서는 멤버변수(인스턴스변수)를 사용할 수 없다.
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
	
}
