package inheritance6;

public class VIPCustomer extends Customer {
	
	private int agentID;			// VIP 고객 상담원 ID
	double saleRatio;				// VIP 할인율
	
	public VIPCustomer() {
		//super();					// 상위 클래스의 생성자를 호출, super(); : 상위 클래스의 기본 생성자 호출
		customerGrade = "VIP";		// VIP 등급
		bonusRatio = 0.05;			// 보너스 포인트 VIP 적립 비율 5%
		saleRatio = 0.1;			// 할인율 10%
	}
	
	public int getAgentID() {		// VIP에게만 필요한 메서드(VIP고객 전담 상담원 ID)
		return agentID;
	}
	
}
