public class Display 
{
	public static void printSeating(Airplane airplane)
	{
		for (int i = 0; i < airplane.NUMBER_OF_FIRST_CLASS_ROWS; i++)
		{
			for (int j = 0; j < airplane.NUMBER_OF_FIRST_CLASS_AISLES; j++)
			{
				System.out.print(intToLetter(airplane.getSeatValue("first", i, j)) + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < airplane.NUMBER_OF_ECONOMY_CLASS_ROWS; i++)
		{
			for (int j = 0; j < airplane.NUMBER_OF_ECONOMY_CLASS_AISLES; j++)
			{
				System.out.print(intToLetter(airplane.getSeatValue("economy", i, j)) + " ");
			}
			System.out.println();
		}
	}
	
	public static String intToLetter(int x)
	{
		if (x == 1)
		{
			return "O"; // "O" for occupied
		}
		return "V"; // "V" for vacant
	}
}
