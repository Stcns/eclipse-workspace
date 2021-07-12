package hiding;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		
		studentLee.studentID = 20210728;
		
//		studentLee.studentName = "이상원";
			//레퍼런스 변수에 직접 할당(private이 되있으면 할당 불가능)
		
		studentLee.setStudentName("이상원");
			//Setter를 통해서 할당
		
		System.out.println(studentLee.getStudentName());
		
	}

}
