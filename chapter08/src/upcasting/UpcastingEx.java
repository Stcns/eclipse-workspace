package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {

		Person p;
		Student s = new Student("�輼��");
		
		p = s;					// ��ĳ����, �ڷ��� ���� �ʿ����
		
//		Person p = new Student("�輼��");
		
		System.out.println(p.name);
		
//		p.grade = "A";				// ������ ����
//		p.department = "HR";		// ������ ����
//		p.name = "ȫ�浿";
//		p.id = "ID";
			
//		s.grade = "A";
//		s.department = "HR";
		s.id = "ID";
		s.name = "�輼��";
		
	}

}