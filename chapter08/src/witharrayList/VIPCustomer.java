package witharrayList;

public class VIPCustomer extends Customer {
	
	private int agentID;			// VIP ���� ���� ID
	double saleRatio;				// VIP ������
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		//super();					// ���� Ŭ������ �����ڸ� ȣ��, super(); : ���� Ŭ������ �⺻ ������ ȣ��
		
		super(customerID, customerName);
		customerGrade = "VIP";		// VIP ���
		bonusRatio = 0.05;			// ���ʽ� ����Ʈ VIP ���� ���� 5%
		saleRatio = 0.1;			// ������ 10%
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);	// VIP ������ �� ���� ���� (10%)
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ���� ��ȣ�� " + agentID + "�Դϴ�.";
	}
	
	public int getAgentID() {		// VIP���Ը� �ʿ��� �޼���(VIP���� ���� ���� ID)
		return agentID;
	}
	
}