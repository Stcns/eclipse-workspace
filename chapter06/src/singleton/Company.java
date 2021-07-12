package singleton;

public class Company {

	private static Company instance = new Company(); 
	private Company(){}			// Company객체를 New 키워드를 통해서 생성하지 못하도록 설정
	
	public static Company getInstance() { // static이 있어 외부클래스에서 이 메소드를 바로 호출가능함.
		
		if (instance == null) {			// null : 비어있다. 값을 가지고 있지 않은 상태
			instance = new Company();
		}
		
		return instance;
	}
	
}
