package com.qa.taxes;

public class Tax {
	
	static double taxPercentage;
	static double salary = 23000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taxPercentage=findTaxPercentage(salary);
		findTax(salary,taxPercentage);
	}
	
	public static double findTaxPercentage(double salary) {
		double taxPercent;
		if (salary>=0 && salary<=14999)
			taxPercent = 0;
		else if (salary>=15000 && salary<=19999)
			taxPercent = 10;
		else if (salary>=20000 && salary<=29999)
			taxPercent = 15;
		else if (salary>=30000 && salary<=44999)
			taxPercent = 20;
		else 
			taxPercent = 25;
		System.out.println("your salary will be taxed by "+taxPercent+"%");
		return taxPercent;
	}
	
	public static double findTax(double salary, double taxPercent) {
		double tax;
		tax = salary*(taxPercent/100);
		System.out.println("your tax amount will be £"+tax);
		return tax;
	}

}
