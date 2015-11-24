package com.company;

/**
 * Created by vasil_000 on 21-Nov-15.
 */
public class Rectangle implements IFigure
{
	private int width;
	private int height;

	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	public double getArea()
	{
		return width * height;
	}

	@Override
	public double getPerimeter()
	{
		return 2 * width + 2 * height;
	}
}
