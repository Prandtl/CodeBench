package Labyrinth;

import java.awt.*;

/**
 * Created by vasil_000 on 27-Nov-15.
 */
public class Hero
{
	private Point coordinates;

	public Hero(Point coordinates)
	{
		this.coordinates = coordinates;
	}

	public Point getCoordinates()
	{
		return coordinates;
	}

	public void setCoordinates(Point newCoordinates)
	{
		coordinates = newCoordinates;
	}

}
