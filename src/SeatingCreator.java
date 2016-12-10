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
		
		Display seating = new Display();
		Airplane plane = new Airplane();

		while (!response.equalsIgnoreCase(SENTINEL)) 
		{	
			Display.printSeating(plane);
			System.out.print("Please enter the name(s) you would like to "
					+ "reserve the seat(s) under: ");
			String names = sc.next(); 
			namesToArray(names);
			
			for(String element : namesList)
			{
				System.out.print("Business or economy for " + element + "? "); 
				String flightClass = sc.next();
				System.out.print("Do you have any seating preference? "
						+ "Window, aisle, or middle? ");
				String pref = sc.next();
				//TODO method that makes preferences using contain() and finds the right seat
				//TODO method assigns seats
				//TODO correspond each seat with a name
			}
			
			System.out.print("Continue? Y/N: ");
			response = sc.next();
		}
		sc.close();	
	}
	
	private static void namesToArray(String names)
	{
		namesList = names.split(", ") ;
	}
	
	private String[] getNamesList()
	{
		return namesList;
	}
}
