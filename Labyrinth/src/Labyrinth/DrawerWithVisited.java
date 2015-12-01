package Labyrinth;

import java.awt.*;
import java.util.HashSet;

/**
 * Created by vasil_000 on 28-Nov-15.
 */
public class DrawerWithVisited
{
	private HashSet<Point> visited;
	private Labyrinth labyrinth;

	public DrawerWithVisited(Labyrinth labyrinth)
	{
		this.labyrinth = labyrinth;
		visited = new HashSet<Point>();
	}

	public void visit(Point point)
	{
		visited.add(point);
	}


	public boolean isVisited(Point point)
	{
		return visited.contains(point);
	}

	public void draw()
	{
		for (int i = 0; i < labyrinth.getHeight(); i++) {
			for (int j = 0; j < labyrinth.getWidth(); j++) {
				Point coordinates = new Point(j, i);
				char cellSymbol = visited.contains(coordinates) ? '*' : labyrinth.isFree(coordinates) ? ' ' : '#';
				System.out.print(cellSymbol);
			}
			System.out.println();
		}
	}
}
