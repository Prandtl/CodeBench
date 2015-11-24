package com.company;

/**
 * Created by vasil_000 on 17-Nov-15.
 */
public class Point
{
	int x;
	int y;

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString()
	{
		return x + " " + y;
	}

}
