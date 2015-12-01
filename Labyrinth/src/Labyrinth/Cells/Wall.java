package Labyrinth.Cells;

/**
 * Created by vasil_000 on 27-Nov-15.
 */
public class Wall implements Cell
{
	@Override
	public boolean isFree()
	{
		return false;
	}
}
