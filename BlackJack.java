package com.qa.blackjack;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( blackJack(2,3));
	}
	
	public static int blackJack(int num1, int num2) {
		if ((num1>0 && num1<=21) && (num2>0 && num2<=21) ){
			if ((21-num1)<(21-num2)){
				return num1;
			}
			else
				return num2;
		}
		else if (num1>0 && num1<=21)
			return num1;
		else if (num2>0 && num2<=21)
			return num2;
		else
			return 0;
	}
}
