public class Display 
{
	public static void printSeating(Airplane airplane)
	{		
		System.out.println("  1 2 3 4");
		char c = 'A';
		for (int i = 0; i < airplane.NUMBER_OF_FIRST_CLASS_ROWS; i++)
		{
			System.out.print(c + " ");
			for (int j = 0; j < airplane.NUMBER_OF_FIRST_CLASS_AISLES; j++)
			{
				System.out.print(intToLetter(airplane.getSeatValue("first", i, j)) + " ");
			}
			System.out.println();
			c++;
		}
		System.out.println();
		
		System.out.println("  1 2 3 4 5 6");
		for (int i = 0; i < airplane.NUMBER_OF_ECONOMY_CLASS_ROWS; i++)
		{
			System.out.print(c + " ");
			for (int j = 0; j < airplane.NUMBER_OF_ECONOMY_CLASS_AISLES; j++)
			{
				System.out.print(intToLetter(airplane.getSeatValue("economy", i, j)) + " ");
			}
			System.out.println();
			c++;
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
