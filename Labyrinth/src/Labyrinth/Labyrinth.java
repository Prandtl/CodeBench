package Labyrinth;

import Labyrinth.Cells.Cell;
import Labyrinth.Cells.FreeCell;
import Labyrinth.Cells.Wall;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by vasil_000 on 27-Nov-15.
 */
public class Labyrinth
{
	private Cell[][] cells;

	public Labyrinth(Cell[][] cells)
	{
		this.cells = cells;
	}

	public static Labyrinth fromFile(String path)
	{
		java.util.List<String> input = null;
		try {
			input = Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			System.out.println("Something went wrong when I was reading the file");
		}
		int height = input.size();
		int width = input.get(0).length();
		Cell[][] newLabyrinth = new Cell[height][];

		for (int i = 0; i < height; i++) {
			Cell[] line = new Cell[width];
			for (int j = 0; j < width; j++) {
				line[j] = input.get(i).charAt(j) == '#' ? new Wall() : new FreeCell();
			}
			newLabyrinth[i] = line;
		}
		return new Labyrinth(newLabyrinth);
	}

	public boolean isFree(Point coordinates)
	{
		return cells[coordinates.y][coordinates.x].isFree();
	}

	public boolean isValid(Point coordinates)
	{
		return (coordinates.x >= 0 &&
				coordinates.y >= 0 &&
				coordinates.x < getWidth() &&
				coordinates.y < getHeight());
	}

	public int getHeight()
	{
		return cells.length;
	}

	public int getWidth()
	{
		return cells[0].length;
	}
}
