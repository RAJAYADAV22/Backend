package com.odigos.core;

public class Variables_Example1 {
	public static void main(String[] args) {
		int number1 = 12;
		int number2 = 13;
		int number3 = 11;
		int sum = number1 + number2 + number3;
		{
			System.out.println("sum of the three numbers is:" + sum);
		}
		float avg = sum / 3;
		{
			System.out.println("average of the three numbers is:" + avg);
		}
		int sub = number1 - number2 - number3;
		{
			System.out.println("sub of the three numbers is:" + sub);
		}
		int mul = number1 * number2 * number3;
		{
			System.out.println("mul of the three numbers is:" + mul);
		}
	}
}
