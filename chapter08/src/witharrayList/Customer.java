package witharrayList;

public class Customer {

	protected int customerID;			// ���� ���̵�
	protected String customerName;	// ���� �̸�
	protected String customerGrade;	// ���� ���(VIP, Gold, Silver)
	int bonusPoint;					// ���ʽ� ����Ʈ
	double bonusRatio;				// ���� ����
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		initCustomer();
	}
	
	
	public void initCustomer() {
		customerGrade = "SILvER";	// �⺻ ���
		bonusRatio = 0.01;			// ���ʽ� ����Ʈ �⺻ ���� ���� 1%
	}
	
	public int calcPrice(int price) {	
		bonusPoint += price * bonusRatio;	// ���ʽ� ����Ʈ ���
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}