package be.heh.entity;

import be.heh.entity.PaymentClassification;

public class CommissionedClassification implements PaymentClassification {
	private double salary;
	private double commission;
	private double commissionTotal;
	//private HashMap <Calendar, SaleReceipt> listSaleReceipt;

	public double calculationSalary(){
		return 25;
	}

	/*public void addSaleReceipt(SalesReceipt salesReceipt){

	}*/
}
