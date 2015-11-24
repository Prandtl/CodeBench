package com.company;

public class Main
{

	public static void main(String[] args)
	{
		IFigure[] figures = new IFigure[4];
		//ABC = Always Be Codin'
		figures[0] = new Rectangle(1, 2);
		figures[1] = new Square(4);
		figures[2] = new Square(9);
		figures[3] = new Circle(5);

		int houseArea = 20;

		for (int i=0;i<figures.length;i++)
		{
			System.out.println(isEnoughToBuildAhouse(houseArea,figures[i]));
			System.out.println(amountOfFlowersToPlant(figures[i]));
		}
	}

	public static boolean isEnoughToBuildAhouse(double houseArea, IFigure figure)
	{
		double figureArea = figure.getArea();
		return houseArea < figureArea;
	}

	public static int amountOfFlowersToPlant(IFigure figure)
	{
		double perimeterWithoutTrack = figure.getPerimeter() - 5;
		return perimeterWithoutTrack>0?(int)perimeterWithoutTrack:0;
	}
}
