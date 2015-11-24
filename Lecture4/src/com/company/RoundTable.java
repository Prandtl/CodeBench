package com.company;

import java.util.ArrayList;

/**
 * Created by vasil_000 on 17-Nov-15.
 */
public class RoundTable extends Table
{
	private int radius;

	ArrayList<String> objectsOnTheTable;

	public RoundTable(int radius)
	{
		this.radius = radius;
		super.objectsOnTheTable = new ArrayList<String>();
	}

	public double getArea()
	{
		return radius*radius*Math.PI;
		//super.
	}
}
