package Labyrinth;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by vasil_000 on 27-Nov-15.
 */
public class ManualController
{
	ConsoleLabyrinthDrawer drawer;
	Labyrinth labyrinth;
	Hero hero;
	private Scanner scanner;

	public ManualController(String path, Point start)
	{
		labyrinth = Labyrinth.fromFile(path);
		hero = new Hero(start);
		drawer = new ConsoleLabyrinthDrawer(labyrinth, hero);
	}

	public void move(Point delta)
	{
		if ((delta.x * delta.x + delta.y * delta.y) > 1) return;

		Point newPosition = (Point) hero.getCoordinates().clone();
		newPosition.translate(delta.x, delta.y);

		if (newPosition.x >= labyrinth.getWidth() || newPosition.y >= labyrinth.getHeight()) return;
		if (newPosition.x < 0 || newPosition.y < 0) return;

		if (!labyrinth.isFree(newPosition)) return;

		hero.setCoordinates(newPosition);
	}

	public void start()
	{
		consoleWrite("Type a, to move left");
		consoleWrite("d - right");
		consoleWrite("w - up");
		consoleWrite("s - down");
		consoleWrite("Type q, to quit.");

		boolean shutdownRequested = false;

		scanner = new Scanner(System.in);

		controlCycle();
	}

	private void controlCycle()
	{
		boolean shutdownRequested = false;
		while (!shutdownRequested) {
			drawer.draw();

			String line = scanner.nextLine();
			char symbol = line.length() == 0 ? '0' : line.charAt(0);


			consoleWrite(Integer.toString(line.length()));

			switch (symbol) {
				case 'a':
					move(new Point(-1, 0));
					break;
				case 'd':
					move(new Point(1, 0));
					break;
				case 'w':
					move(new Point(0, -1));
					break;
				case 's':
					move(new Point(0, 1));
					break;
				case 'q':
					shutdownRequested = true;
					break;
				default:
					break;
			}
		}
	}

	private void consoleWrite(String message)
	{
		System.out.println(message);
	}
}
