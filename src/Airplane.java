public class Airplane 
{
	public final int NUMBER_OF_FIRST_CLASS_ROWS = 5;
	public final int NUMBER_OF_FIRST_CLASS_AISLES = 4;
	public final int NUMBER_OF_ECONOMY_CLASS_ROWS = 15;
	public final int NUMBER_OF_ECONOMY_CLASS_AISLES = 6;
	private int[][] firstClassSeats = new int[NUMBER_OF_FIRST_CLASS_ROWS][];
	private int[][] economyClassSeats = new int[NUMBER_OF_ECONOMY_CLASS_ROWS][];
	
	public Airplane()
	{
		for (int rowIndex = 0; rowIndex < NUMBER_OF_FIRST_CLASS_ROWS; rowIndex++)
		{
			firstClassSeats[rowIndex] = new int[NUMBER_OF_FIRST_CLASS_AISLES];
			for (int aisleIndex = 0; aisleIndex < NUMBER_OF_FIRST_CLASS_AISLES; aisleIndex++)
			{
				firstClassSeats[aisleIndex][rowIndex] = 0; // Assigns all the first class seats to 0 (Unoccupied)
			}
		}
		for (int rowIndex = 0; rowIndex < NUMBER_OF_ECONOMY_CLASS_ROWS; rowIndex++)
		{
			economyClassSeats[rowIndex] = new int [NUMBER_OF_ECONOMY_CLASS_AISLES];
			for (int aisleIndex = 0; aisleIndex < NUMBER_OF_ECONOMY_CLASS_AISLES; aisleIndex++)
			{
				economyClassSeats[aisleIndex][rowIndex] = 0; // Assigns all the economy class seats to 0
			}
		}
	}
	
	public int getSeatValue(String seatingClass, int x, int y) // Checks if seat is occupied or unoccupied
	{
		if (seatingClass.equals("first"))
		{
			return firstClassSeats[x][y];
		}
		return economyClassSeats[x][y];
	}
	
	public void occupySeat(String seatingClass, int x, int y)
	{
		if (seatingClass.equals("first"))
		{
			firstClassSeats[x][y] = 1;
		}
		economyClassSeats[x][y] = 1;
	}
}