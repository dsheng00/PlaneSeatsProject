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
		final String SENTINEL = "N"; //change depending on the question
		String response = "";
		Scanner sc = new Scanner(System.in);
		
		Display seating = new Display();
		Airplane plane = new Airplane();

		while (!response.equalsIgnoreCase(SENTINEL)) 
		{	
			Display.printSeating(plane);
			System.out.print("Please enter the number of seats "
								+ "you would like to reserve: ");
			int num = sc.nextInt();
			//method that takes the number of people
			System.out.print("Please enter the names that the seats will go under "
					+ "(in order): ");
			String names = sc.next(); //correspond each seat with a name
			namesToArray(names);
			
			for(String element : namesList) //runs through the protocol for each passenger
			{
				System.out.print("Business or economy for " + element + "? "); 
				String flightClass = sc.next();
				System.out.print("Do you have any seating preference? "
						+ "Window, aisle, or middle? ");
				String pref = sc.next();
				//method that makes preferences using contain()
				//method assigns seats
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
