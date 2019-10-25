package be.heh.entity;

import java.util.Calendar;
import java.util.HashMap;

public class CommissionedClassification implements PaymentClassification {
	private double salary;
	private double commission;
	private double commissionTotal;
	/*private HashMap<Calendar, SaleReceipt> listSaleReceipt;*/
	HashMap<Calendar, SaleReceipt> listSaleReceipt = new HashMap<>();

	public double calculationSalary(){
		return 25;
	}

	public void addSaleReceipt(SaleReceipt saleReceipt){
		listSaleReceipt.put(saleReceipt.getDate(), saleReceipt);
	}

	public SaleReceipt getSalesReceipt(Calendar date){
		return listSaleReceipt.get(date);
	}
}
