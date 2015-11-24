package com.company;

import java.util.ArrayList;

/**
 * Created by vasil_000 on 17-Nov-15.
*/
public class Table
{
	ArrayList<String> objectsOnTheTable;

	public Table()
	{
		objectsOnTheTable = new ArrayList<String>();
	}

	public void putOnTheTable(String newObject)
	{
		objectsOnTheTable.add(newObject);
	}

	public ArrayList<String> getObjectsFromTheTable()
	{
		ArrayList<String> objectsToReturn = objectsOnTheTable;
		objectsOnTheTable = new ArrayList<String>();
		return objectsToReturn;
	}
}
