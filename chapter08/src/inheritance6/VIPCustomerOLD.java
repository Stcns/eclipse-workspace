package inheritance6;

public class VIPCustomerOLD {

	private int customerID;			// 고객 아이디
	private String customerName;	// 고객 이름
	private String customerGrade;	// 고객 등급
	int bonusPoint;					// 보너스 포인트
	double bonusRatio;				// 적립 비율
	
	private int agentID;			// VIP 고객 상담원 ID
	double saleRatio;				// VIP 할인율
	
	public VIPCustomerOLD() {
		customerGrade = "VIP";		// VIP 등급
		bonusRatio = 0.05;			// 보너스 포인트 VIP 적립 비율 5%
		saleRatio = 0.1;			// 할인율 10%
	}
	
	public int calcPrice(int price) {	
		bonusPoint += price * bonusRatio;	// 보너스 포인트 계산
		return price - (int)(price * saleRatio);	// 10% 할인율 적용
	}
	
	public int getAgentID() {		// VIP에게만 필요한 메서드(VIP고객 전담 상담원 ID)
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
}
