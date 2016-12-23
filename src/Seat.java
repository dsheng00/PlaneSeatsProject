public class Seat
{
	private boolean occupied;
  
	public Seat()
	{
  		occupied = false;
	}

	public void occupy()
	{
		occupied = true;
	}

	public void unoccupy()
	{
		occupied = false;
	}
	
	public boolean checkOccupancy()
	{
		return occupied;
	}
}
