/**
 * Simulates an airplane seat.
 * @author Matthew Guo, Tenzin Loden, David Sheng, Eli Zheng
 * @version 1.0
 */
public class Seat
{
	private boolean occupied;
  
	/**
	 * Creats a seat with an occupancy status.
	 */
	public Seat()
	{
  		occupied = false;
	}

	/**
	 * Occupies a seat.
	 */
	public void occupy()
	{
		occupied = true;
	}

	/**
	 * Unoccupies a seat.
	 */
	public void unoccupy()
	{
		occupied = false;
	}
	
	/**
	 * Checks the occupancy status of a seat.
	 * @return
	 */
	public boolean checkOccupancy()
	{
		return occupied;
	}
}
