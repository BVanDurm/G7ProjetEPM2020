package be.heh.entity;

import java.util.Calendar;
import java.util.HashMap;

public class CommissionedClassification implements PaymentClassification {
	private double Salary;
	private double Commission;
	private double commissionTotal;
	/*private HashMap<Calendar, SaleReceipt> listSaleReceipt;*/
	HashMap<Calendar, SaleReceipt> listSaleReceipt = new HashMap<>();

	public CommissionedClassification(double salary, double commission) {

		this.Salary = salary;
		this.Commission = commission;

	}

	public double calculationSalary(){
		return 25;
	}

	public void addSaleReceipt(SaleReceipt saleReceipt){
		listSaleReceipt.put(saleReceipt.getDate(), saleReceipt);
	}

	public SaleReceipt getSalesReceipt(Calendar date){
		return listSaleReceipt.get(date);
	}

	public double getCommission()
	{
		return Commission;
	}
}
