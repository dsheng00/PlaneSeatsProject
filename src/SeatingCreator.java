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
			
			System.out.print("Please enter the name(s) you would like to "
					+ "reserve the seat(s) under: ");
			String names = sc.nextLine();
			namesToArray(names);
			
			for(String name : namesList)
			{
				System.out.print(name.substring(0, 1).toUpperCase() + name.substring(1)
						+ "Would you like to choose or "
						+ "automatically assign seats? ");
				String reChoice = sc.nextLine();
				
				if (reChoice.equalsIgnoreCase("choose")
						|| reChoice.equalsIgnoreCase("manual"))
				{
					System.out.print("First class or economy? ");
					String flightClass = sc.nextLine();
					System.out.print("Please enter your choice of row: ");
					String row = sc.nextLine();
					System.out.print("Please enter your choice of column: ");
					String column = sc.nextLine();
					plane.occupySeat(name, flightClass, rowToInt(row), 
								Integer.parseInt(column));
				}
				else if (reChoice.substring(0, 4).equalsIgnoreCase("auto"))
				{
					System.out.print("First class or economy? ");
					String flightClass = sc.nextLine();
					System.out.print("Do you have any seating preference? "
							+ "Window, column, middle, or none? ");
					String pref = sc.nextLine();
					//TODO a smart algorithm that finds you a lovely seat
					//TODO put seats together if they want to (or just automatically do it if they come in packs)
				}
				else
				{
					System.out.println("That is not a valid option. "
							+ "We will reirect you to our non-existence help center"
							+ " for further instructions.");
				}
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
