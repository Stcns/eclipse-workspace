package constructor;

public class Person {
	
	String name;
	float height;
	float weight;

	Person() {}		// 기본 생성자, 생략 가능
					// 클래스 내에 다른 생성자가 있을 때
					// 만약에 기본 생성자를 호출하면 오류
	public Person(String pname) {
		name = pname;
	}

	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
		
	}
	
}