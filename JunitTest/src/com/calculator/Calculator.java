package com.calculator;

public class Calculator {

	public int addition(int a, int b)
	{
		return a+b;
	}
	public int subtraction(int a, int b)
	{
		return a-b;
	}
	public int multiplication(int a, int b)
	{
		return a*b;
	}
	public int division(int a, int b)
	{
		return a/b;
	}
	
	public boolean isPalindrome(String s)
	{
		return new StringBuilder(s).reverse().toString().equals(s);	
	}
}
