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
			System.out.print("Reserve or remove seat ticket(s)?");
			String reChoice = sc.nextLine();
			if (reChoice.equalsIgnoreCase("reserve"))
			{
				System.out.print("Please enter the name(s) you would like to "
						+ "reserve the seat(s) under: ");
				String names = sc.nextLine(); 
				namesToArray(names);
				
				for(String element : namesList)
				{
					System.out.print("First class or economy for " + element + "? "); 
					String flightClass = sc.nextLine();
					System.out.print("Do you have any seating preference? "
							+ "Window, aisle, or middle? ");
					String pref = sc.nextLine();
					//TODO method that makes preferences using contain() and finds the right seat
					//TODO method assigns seats
					//TODO correspond each seat with a name
				}
			}
			else
			{
				//a search system of some sort
				//and/or remove a given seat number
			}
			System.out.print("Continue? Y/N: ");
			response = sc.nextLine();
			System.out.println();
		}
		sc.close();	
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
