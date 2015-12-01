package Labyrinth;

import java.awt.*;

/**
 * Created by vasil_000 on 27-Nov-15.
 */
public class ConsoleLabyrinthDrawer
{
	Labyrinth labyrinth;
	Hero hero;

	public ConsoleLabyrinthDrawer(Labyrinth labyrinth, Hero hero)
	{
		this.labyrinth = labyrinth;
		this.hero = hero;
	}

	public void draw()
	{
		for (int i = 0; i < labyrinth.getHeight(); i++) {
			for (int j = 0; j < labyrinth.getWidth(); j++) {
				Point coordinates = new Point(j, i);
				char cellSymbol = hero.getCoordinates().equals(coordinates)?
														'@':
														labyrinth.isFree(coordinates)?
														' ':
														'#';
				System.out.print(cellSymbol);
			}
			System.out.println();
		}
	}
}
