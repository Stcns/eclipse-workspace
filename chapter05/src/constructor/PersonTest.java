package constructor;

public class PersonTest {

	public static void main(String[] args) {

//		Person personLee = new Person();
		
		Person personKim = new Person();	// �⺻ ������ ȣ��
		personKim.name = "������";
		personKim.height = 85.5F;
		personKim.weight = 180.0F;
		
		Person personLee = new Person("�̼���", 175, 75);
		
	}

}
