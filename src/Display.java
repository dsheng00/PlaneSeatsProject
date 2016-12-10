public class Display 
{
	public static void printSeating(Airplane airplane)
	{
		char c = 'A';
		while (c <= 'F') 
		{
			for (int i = 0; i < airplane.NUMBER_OF_FIRST_CLASS_ROWS; i++)
			{	
				System.out.print(c + " ");
				for (int j = 0; j < airplane.NUMBER_OF_FIRST_CLASS_AISLES; j++)
				{
					System.out.print(intToLetter(airplane.getSeatValue("first", i, j)) + " ");
				}
				c++;
				System.out.println();
			}
		}
		System.out.println();
		
		while(c <= 'U')
		{		
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
