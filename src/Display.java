public class Display 
{
	public static void printSeating(Airplane airplane, String section)
	{	
		char c = 'A';

		if (section.equalsIgnoreCase("first")
				|| section.equalsIgnoreCase("1st"))
		{
			System.out.println("    1 2   3 4    ");
			for (int i = 0; i < airplane.NUMBER_OF_FIRST_CLASS_ROWS; i++)
			{
				System.out.print("  " + c + " ");
				for (int j = 0; j < airplane.NUMBER_OF_FIRST_CLASS_AISLES; j++)
				{
					System.out.print(boolToLetter(airplane.checkOccupied("first", i, j)) + " ");
					if (j == airplane.NUMBER_OF_FIRST_CLASS_AISLES / 2 - 1)
					{
						System.out.print("  ");
					}
				}
				System.out.println();
				c++;
			}
			System.out.println();
		}
		
		if (section.equalsIgnoreCase("econ")
				|| section.equalsIgnoreCase("econ")
				|| section.equalsIgnoreCase("second")
				|| section.equalsIgnoreCase("2nd"))
		{
			System.out.println("  1 2 3   4 5 6  ");
			for (int i = 0; i < airplane.NUMBER_OF_ECONOMY_CLASS_ROWS; i++)
			{
				System.out.print(c + " ");
				for (int j = 0; j < airplane.NUMBER_OF_ECONOMY_CLASS_AISLES; j++)
				{
					System.out.print(boolToLetter(airplane.checkOccupied("economy", i, j)) + " ");
					if (j == airplane.NUMBER_OF_ECONOMY_CLASS_AISLES / 2 - 1)
					{
						System.out.print("  ");
					}
				}
				System.out.println();
				c++;
			}
		}
		
		if (section.equalsIgnoreCase("whole"))
		{
			System.out.println("    1 2   3 4    ");
			for (int i = 0; i < airplane.NUMBER_OF_FIRST_CLASS_ROWS; i++)
			{
				System.out.print("  " + c + " ");
				for (int j = 0; j < airplane.NUMBER_OF_FIRST_CLASS_AISLES; j++)
				{
					System.out.print(boolToLetter(airplane.checkOccupied("first", i, j)) + " ");
					if (j == airplane.NUMBER_OF_FIRST_CLASS_AISLES / 2 - 1)
					{
						System.out.print("  ");
					}
				}
				System.out.println();
				c++;
			}
			System.out.println();
			
			System.out.println("  1 2 3   4 5 6  ");
			for (int i = 0; i < airplane.NUMBER_OF_ECONOMY_CLASS_ROWS; i++)
			{
				System.out.print(c + " ");
				for (int j = 0; j < airplane.NUMBER_OF_ECONOMY_CLASS_AISLES; j++)
				{
					System.out.print(boolToLetter(airplane.checkOccupied("economy", i, j)) + " ");
					if (j == airplane.NUMBER_OF_ECONOMY_CLASS_AISLES / 2 - 1)
					{
						System.out.print("  ");
					}
				}
				System.out.println();
				c++;
			}
		}
	}
	
	public static String boolToLetter(boolean x)
	{
		if (x)
		{
			return "O"; // "O" for occupied
		}
		return "V"; // "V" for vacant
	}
}
