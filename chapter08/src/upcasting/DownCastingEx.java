package upcasting;

public class DownCastingEx {

	public static void main(String[] args) {

		Person p = new Student("�輼��");	// ��ĳ����
		Student s;
		
		s = (Student)p;				// �ٿ�ĳ����, �ݵ�� �ڷ����� ����
		
		System.out.println(p.name);
		s.grade = "A";
		
	}

}