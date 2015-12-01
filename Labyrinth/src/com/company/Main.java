package com.company;

import Labyrinth.VisitationController;

import java.awt.*;
import java.util.*;

public class Main
{

	static boolean sleep = true;

	public static void main(String[] args) throws InterruptedException
	{

		VisitationController controller =
				new VisitationController("C:\\Workspace\\Codebench\\Labyrinth\\maps\\lab2.txt");
		controller.start();
		Point target = new Point(3, 1);
		Point start = new Point(3,3);


		boolean flag = false;
		Stack<Point> stack=new Stack<Point>();
		LinkedList<Point> queue = new LinkedList<Point>();
		queue.push(start);

		//stack.push(start);
		controller.visit(start);

		while (!queue.isEmpty())
		{
			Point current = queue.poll();

			ArrayList<Point> neighbours = controller.getNeighbours(current);
			for (int i=0;i<neighbours.size();i++)
			{
				Point nextNeighbour = neighbours.get(i);

				if(nextNeighbour.equals(target)) {
					flag = true;
					break;
				}

				controller.visit(nextNeighbour);
				queue.push(nextNeighbour);


			}


		}


		System.out.println(flag?"Yay! we found the target":"We didn't find it.");
	}
}
