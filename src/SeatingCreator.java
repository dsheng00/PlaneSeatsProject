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

			if (reChoice.equalsIgnoreCase("choose")
					|| reChoice.equalsIgnoreCase("manual"))
			{
				System.out.print("Please enter the name(s) you would like to "
						+ "reserve the seat(s) under: ");
				String names = sc.nextLine();
				namesToArray(names);

				for(String name : namesList)
				{
					System.out.print("First class or economy for " + name + "? ");
					String flightClass = sc.nextLine();
					System.out.print("Please enter your choice of row: ");
					String row = sc.nextLine();
					System.out.print("Please enter your choice of column: ");
					int column = sc.nextInt();
					plane.occupySeat(name, flightClass, rowToInt(row), column);
				}
			}
			else if (reChoice.substring(0, 4).equalsIgnoreCase("auto"))
			{
				System.out.print("Please enter the name(s) you would like to "
						+ "reserve the seat(s) under: ");
				String names = sc.nextLine();
				namesToArray(names);

				for(String name : namesList)
				{
					System.out.print("First class or economy for " + name + "? ");
					String flightClass = sc.nextLine();
					System.out.print("Do you have any seating preference? "
							+ "Window, column, or middle? ");
					String pref = sc.nextLine();
					//TODO method that makes preferences using contain() and finds the right seat
					//TODO correspond each seat with a name
				}
			}
			else
			{
				System.out.println("That is not a valid option. "
						+ "We will reirect you to our non-existence help center"
						+ " for further instructions.");
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

	private static int rowToInt(String row)
	{
		Character c = row.charAt(0);
		return Character.getNumericValue(c) - 9;
	}
	
	/**
	 * 
	 * @param sidePref
	 */
	private static void chooseSeat(String flightClass, String sidePref, 
			String companion)
	{
		
	}
}
