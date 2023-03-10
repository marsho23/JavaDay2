package com.qa.calculator;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum: " + sum(1,2));
		System.out.println("mulitplication: " + multiply(1,2));
		System.out.println("subtraction: " + subtract(1,2));
		divide(3,2);
	}
	
	public static int sum(int int1, int int2) {
		int sumOfIntegers = int1+int2;
		return sumOfIntegers;
	}
	
	public static int multiply(int int1,int int2) {
		int result = int1*int2;
		return result;
	}
	
	public static int subtract(int int1,int int2) {
		int result = int1-int2;
		return result;
	}
	
	public static void divide(double num1,double num2) {
		double result;
		if (num1<num2) {
			result = num1/num2;			
			System.out.println("Division: "+result);
		}
		else {
			System.out.println("division cannot be performed");
		}
	}
}
