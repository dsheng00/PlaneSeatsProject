public class Airplane 
{
	public final int NUMBER_OF_FIRST_CLASS_ROWS = 5;
	public final int NUMBER_OF_FIRST_CLASS_AISLES = 4;
	public final int NUMBER_OF_ECONOMY_CLASS_ROWS = 15;
	public final int NUMBER_OF_ECONOMY_CLASS_AISLES = 6;
	private Seat[][] firstClassSeats;
	private Seat[][] economyClassSeats;
	
	public Airplane()
	{
		firstClassSeats = new Seat[NUMBER_OF_FIRST_CLASS_ROWS][];
		economyClassSeats = new Seat[NUMBER_OF_ECONOMY_CLASS_ROWS][];
		for (int rowIndex = 0; rowIndex < NUMBER_OF_FIRST_CLASS_ROWS; rowIndex++)
		{
			firstClassSeats[rowIndex] = new Seat[NUMBER_OF_FIRST_CLASS_AISLES];
			for (int aisleIndex = 0; aisleIndex < NUMBER_OF_FIRST_CLASS_ROWS; aisleIndex++)
			{
				firstClassSeats[rowIndex][aisleIndex] = new Seat();
			}
		}
		for (int rowIndex = 0; rowIndex < NUMBER_OF_ECONOMY_CLASS_ROWS; rowIndex++)
		{
			economyClassSeats[rowIndex] = new Seat[NUMBER_OF_ECONOMY_CLASS_AISLES];
			for (int aisleIndex = 0; aisleIndex < NUMBER_OF_ECONOMY_CLASS_ROWS; aisleIndex++)
			{
				economyClassSeats[rowIndex][aisleIndex] = new Seat();
			}
		}
	}
	
	public void occupySeat(String passengerName, String seatingClass, int row, int column)
	{
		if (seatingClass.equalsIgnoreCase("first"))
		{
			firstClassSeats[row - 1][column - 1].occupy(passengerName);
		}
		else if (seatingClass.equalsIgnoreCase("economy"))
		{
			economyClassSeats[row - 1][column - 1].occupy(passengerName);
		}
	}
	
	public void removeSeat(String seatingClass, int row, int column)
	{
		if (seatingClass.equalsIgnoreCase("first")
		{
			firstClassSeats[row - 1][column - 1].unoccupy();
		}
		else if (seatingClass.equalsIgnoreCase("economy"))
		{
			economyClassSeats[row - 1][column - 1].unoccupy();
		}
	}
}
