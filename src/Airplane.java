public class Airplane 
{
	public final int NUMBER_OF_FIRST_CLASS_ROWS = 5;
	public final int NUMBER_OF_FIRST_CLASS_AISLES = 4;
	public final int NUMBER_OF_ECONOMY_CLASS_ROWS = 15;
	public final int NUMBER_OF_ECONOMY_CLASS_AISLES = 6;
	private int[][] firstClassSeats;
	private int[][] economyClassSeats;
	
	public Airplane()
	{
		firstClassSeats = new int[NUMBER_OF_FIRST_CLASS_ROWS][];
		economyClassSeats = new int[NUMBER_OF_ECONOMY_CLASS_ROWS][];
		for (int rowIndex = 0; rowIndex < NUMBER_OF_FIRST_CLASS_ROWS; rowIndex++)
		{
			firstClassSeats[rowIndex] = new int[NUMBER_OF_FIRST_CLASS_AISLES];
			for (int aisleIndex = 0; aisleIndex < NUMBER_OF_FIRST_CLASS_AISLES; aisleIndex++)
			{
				firstClassSeats[rowIndex][aisleIndex] = 0; // Assigns all the first class seats to 0 (Unoccupied)
			}
		}
		for (int rowIndex = 0; rowIndex < NUMBER_OF_ECONOMY_CLASS_ROWS; rowIndex++)
		{
			economyClassSeats[rowIndex] = new int [NUMBER_OF_ECONOMY_CLASS_AISLES];
			for (int aisleIndex = 0; aisleIndex < NUMBER_OF_ECONOMY_CLASS_AISLES; aisleIndex++)
			{
				economyClassSeats[rowIndex][aisleIndex] = 0; // Assigns all the economy class seats to 0
			}
		}
	}
	
	public int getSeatValue(String seatingClass, int x, int y) // Checks if seat is occupied or unoccupied
	{
		if (seatingClass.equalsIgnoreCase("first"))
		{
			return firstClassSeats[x][y];
		}
		return economyClassSeats[x][y];
	}
	
	public void occupySeat(String seatingClass, int x, int y) // Occupies the seat in the given seat coordinate
	{ //add name later?
		if (seatingClass.substring(0, 5).equalsIgnoreCase("first") 
				|| seatingClass.equalsIgnoreCase("1st")) 
		{
			firstClassSeats[x - 1][y - 1] = 1; // Since array indices start at 0, 1 is subtracted
		}
		else
		{
			economyClassSeats[x - 1][y - 1] = 1;
		}
	}
	
	public void removeSeat(String seatingClass, int x, int y) //might have to use name too
	{
		if (seatingClass.substring(0, 5).equalsIgnoreCase("first") 
				|| seatingClass.equalsIgnoreCase("1st")) 
		{
			firstClassSeats[x - 1][y - 1] = 0; // Since array indices start at 0, 1 is subtracted
		}
		else
		{
			economyClassSeats[x - 1][y - 1] = 0;
		}
	}
}