package witharraylist;

public class VVIPCustomer extends Customer {

	private int valetID;
	private int agentID;
	double saleRatio;
	
	public VVIPCustomer(int customerID, String customerName, int agentID, int valetID){
		super(customerID, customerName);
	
		customerGrade = "VVIP";
		bonusRatio = 0.15;
		saleRatio = 0.2;
		this.agentID = agentID;
		this.valetID = valetID;
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo(){
		return showCustomerinfo(super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.");
	}

	public int getAgentID(){
		return agentID;
	}
	
	public String showCustomerinfo(String s) {
		return s + super.showCustomerInfo() + " 담당 발렛파킹 번호는 " + valetID + "입니다.";
	}
	
	public int getValetID() {
		return valetID;
	}
}
