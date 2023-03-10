package com.qa.uniquesum;

public class UniqueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( uniqueSum(1,1,1));
		System.out.println( uniqueSum(2,1,1));
		System.out.println( uniqueSum(1,3,1));
		System.out.println( uniqueSum(1,1,5));
		System.out.println( uniqueSum(2,1,3));
	}
	
	public static int uniqueSum (int num1, int num2, int num3) {
		if (num1==num2 && num2==num3)
			return num1;
		else if (num1==num2)
			return num1+num3;
		else if (num2==num3)
			return num1+num2;
		else if (num1==num3)
			return num1+num2;
		else 
			return num1+num2+num3;
	}
}
