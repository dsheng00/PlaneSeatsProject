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
			if (reChoice.equalsIgnoreCase("choose"))
			{
				System.out.print("Please enter the seat name(s) you would like to reserve: ");
				String names = sc.nextLine(); 
				namesToArray(names);
				
				for(String element : namesList)
				{
					System.out.print("First class or economy for " + element + "? "); 
					String pref = sc.nextLine();
					//TODO method that makes preferences using contain() and finds the right seat
					//TODO method assigns seats
					//TODO correspond each seat with a name
				}
			}
			
			else if (reChoice.equalsIgnoreCase("automatically assign seats"))
			{
				String flightClass = sc.nextLine();
				System.out.println("Do you have any seating preference? "
					+ "Window, aisle, or middle? ");
				
			}
			else
			{
				System.out.println("That is not a valid option.");
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
}
