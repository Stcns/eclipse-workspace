package upcasting;

public class DownCastingEx {

	public static void main(String[] args) {

		Person p = new Student("김세종");	// 업캐스팅
		Student s;
		
		s = (Student)p;				// 다운캐스팅, 반드시 자료형을 명시
		
		System.out.println(p.name);
		s.grade = "A";
		
	}

}
