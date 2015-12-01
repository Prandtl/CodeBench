package com.company;

public class Main
{
	public static int factorial(int n)
	{
		if (n <= 1) return 1;
		return n * factorial(n - 1);
	}

	public static int fibbs(int n)
	{
		if (n <= 0) return 0;
		if (n == 1 || n == 2) return 1;
		return fibbs(n - 1) + fibbs(n - 2);
	}

	public static int fibbonacci(int n)
	{

		if (n <= 0) return 0;
		if (n == 1 || n == 2) return 1;
		int current  = 2;
		int previous = 1;
		int index = 3;

		while(index!=n)
		{
			index++;
			int tempo = current+previous;
			previous = current;
			current = tempo;
		}
		return current;
	}

	public static void main(String[] args)
	{
		System.out.println(fibbonacci(10000));
	}

}
