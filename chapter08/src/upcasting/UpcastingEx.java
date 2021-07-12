package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {

		Person p;
		Student s = new Student("김세종");
		
		p = s;					// 업캐스팅, 자료형 명시 필요없음
		
//		Person p = new Student("김세종");
		
		System.out.println(p.name);
		
//		p.grade = "A";				// 컴파일 오류
//		p.department = "HR";		// 컴파일 오류
//		p.name = "홍길동";
//		p.id = "ID";
			
//		s.grade = "A";
//		s.department = "HR";
		s.id = "ID";
		s.name = "김세종";
		
	}

}
