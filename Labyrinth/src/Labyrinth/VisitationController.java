package Labyrinth;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vasil_000 on 28-Nov-15.
 */
public class VisitationController
{
	DrawerWithVisited drawer;
	Labyrinth labyrinth;
	private Scanner scanner;

	public VisitationController(String path)
	{
		labyrinth = Labyrinth.fromFile(path);
		drawer = new DrawerWithVisited(labyrinth);
	}

	public void visit(Point point)
	{
		drawer.visit(point);
		update();
	}

	public ArrayList<Point> getNeighbours(Point coordinates)
	{
		ArrayList<Point> neighbours = new ArrayList<Point>();
		for (int i = -1; i <= 1; i++)
			for (int j = -1; j <= 1; j++) {
				if (Math.abs(i) == Math.abs(j)) continue;
				Point neighbour = new Point(coordinates.x + i, coordinates.y + j);
				if (!labyrinth.isValid(neighbour)) continue;
				if (!labyrinth.isFree(neighbour)) continue;
				if (drawer.isVisited(neighbour)) continue;
				neighbours.add(neighbour);
			}
		return neighbours;
	}

	public void start()
	{
		update();
	}

	public void update()
	{
		drawer.draw();
		consoleWrite("");
	}

	private void consoleWrite(String message)
	{
		System.out.println(message);
	}
}
