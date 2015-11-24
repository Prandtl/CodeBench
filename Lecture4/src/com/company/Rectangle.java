package com.company;

/**
 * Created by vasil_000 on 17-Nov-15.
 */
public class Rectangle extends Object
{
	Point upperLeft;
	int width;
	int height;

	public Rectangle(int x, int y, int width, int height)
	{
		upperLeft = new Point(x,y);
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeft, int width, int height)
	{
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}

	public int getArea()
	{
		return width*height;
	}

	@Override
	public String toString()
	{
		return super.toString();
	}
}
