package com.company;

/**
 * Created by vasil_000 on 17-Nov-15.
 */
public class WaterDispenser
{
	private double amountOfWater;

	public WaterDispenser(double initialAmount)
	{
		amountOfWater = initialAmount;
	}

	public double getAmountOfWater()
	{
		return amountOfWater;
	}

	private void setAmountOfWater(double amount)
	{
		amountOfWater = amount;
	}

	private void giveWater()
	{
		System.out.println(amountOfWater + " liters left in the dispencer");
	}
}
