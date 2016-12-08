public class Airplane 
{
	private int[][] rows = new int[5][];
	
	public Airplane()
	{
		for (int rowIndex = 0; rowIndex < 5; rowIndex++) // Assigns all the seats to 0 (Unoccupied)
		{
			rows[rowIndex] = new int[4];
			for (int aisleIndex = 0; aisleIndex < 4; aisleIndex++)
			{
				rows[aisleIndex][rowIndex] = 0;
			}
		}
	}
	slkjsadflkjsdf;
}