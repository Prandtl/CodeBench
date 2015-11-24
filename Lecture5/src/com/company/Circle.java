package com.company;

/**
 * Created by vasil_000 on 21-Nov-15.
 */
public class Circle implements IFigure
{
	double radius;

	public Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter()
	{
		return Math.PI * 2 * radius;
	}
}
