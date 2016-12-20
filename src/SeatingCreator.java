import java.util.Scanner;

public class SeatingCreator 
{
	private static String[] namesList;
	
	public SeatingCreator()
	{
		String[] namesList;
	}
	
	public static void main(String args[])
	{
		final String SENTINEL = "N";
		String response = "";
		Scanner sc = new Scanner(System.in);
		
		Airplane plane = new Airplane();

		while (!response.equalsIgnoreCase(SENTINEL)) 
		{	
			Display.printSeating(plane);
			System.out.println();
			System.out.print("Would you like to choose or automatically assign seats? ");
			String reChoice = sc.nextLine();
			
			if (reChoice.substring(0, 6).equalsIgnoreCase("choose"))
			{
				System.out.print("Please enter the name(s) you would like to "
						+ "reserve the seats under: ");
				String names = sc.nextLine(); 
				namesToArray(names);
				
				for(String element : namesList)
				{
					System.out.print("First class or economy for " + element + "? "); 
					String flightClass = sc.nextLine();
					System.out.print("PLease enter your choice of row: ");
					String row = sc.nextLine();
					System.out.print("Please enter your choice of column: ");
					String column = sc.nextLine();
					
				}
			}
			else if (reChoice.substring(0, 4).equalsIgnoreCase("auto"))
			{
				System.out.print("Please enter the name(s) you would like to "
						+ "reserve the seats under: ");
				String names = sc.nextLine(); 
				namesToArray(names);
				
				for(String element : namesList)
				{
					System.out.print("First class or economy for " + element + "? "); 
					String flightClass = sc.nextLine();
					//TODO method that makes preferences using contain() and finds the right seat
					//TODO method assigns seats
					//TODO correspond each seat with a name
					System.out.print("Do you have any seating preference? "
							+ "Window, aisle, or middle? ");
					String pref = sc.nextLine();
				}
			}
			else
			{
				System.out.println("That is not a valid option. "
						+ "We will reirect you to our non-existence help center.");
			}
			
			System.out.print("Continue? Y/N: ");
			response = sc.nextLine();
			System.out.println();
		}
		sc.close();	
		Display.printSeating(plane);
	}
	
	private static void namesToArray(String names)
	{
		namesList = names.split(", ");
	}
	
	private String[] getNamesList()
	{
		return namesList;
	}
	
	private int rowToInt(String row)
	{
		
	}
}
