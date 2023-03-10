package com.qa.flowchart;

public class Flowchart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int method1(int num1, int num2, boolean bool) {
		int result;
		if (bool) 
			result = num1+num2;
		else
			result=num1*num2;
		return result;
	}

}
