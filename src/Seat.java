public class Seat
{
	private boolean occupied;
	private String passengerName;
  
	public Seat()
	{
  		occupied = false;
  		passengerName = "";
	}

	public void occupy(String name)
	{
		occupied = true;
		passengerName = name;
	}

	public void unOccupy()
	{
		occupied = false;
		passengerName = "";
	}
	
	public boolean checkOccupancy()
	{
		return occupied;
	}
  
  	public String getPassengerName()
  	{
    		return passengerName;
	}
}
