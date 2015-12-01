package com.company;

import java.util.Date;

public class Main
{
	public static void main(String[] args)
	{
		testStringAdditions(10000);

	}

	public static void testStringAdditions(int length)
	{

		String[] strings = new String[length];
		for (int i = 0; i < length; i++) {
			double num = Math.random() * 100;
			strings[i] = Double.toString(num);
		}
		String a = "";
		Date start = new Date();
		for (int i = 0; i < length; i++) {
			a += strings[i];
		}

		/*StringBuilder sb = new StringBuilder();

		Date start = new Date();
		for (int i=0;i<length;i++)
		{
			sb.append(strings[i]);
		}
		String result = sb.toString();*/
		Date end = new Date();

		long time = end.getTime() - start.getTime();
		System.out.println(time);
	}

}
