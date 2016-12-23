/**
 * Simulates an airplane seat.
 * @author Matthew Guo, Tenzin Loden, David Sheng, Eli Zhang
 * @version 1.0
 */
public class Seat
{
	private boolean occupied;
  
	/**
	 * Creates a seat with an occupancy status.
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
	 * Checks the occupancy status of a seat.
	 * @return
	 */
	public boolean checkOccupancy()
	{
		return occupied;
	}
}
