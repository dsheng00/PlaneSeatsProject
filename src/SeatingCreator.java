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
		final String SENTINEL = "Quit";
		String response = "";
		Scanner sc = new Scanner(System.in);

		Airplane plane = new Airplane();

		while (!response.equalsIgnoreCase(SENTINEL))
		{
			System.out.println();
			System.out.println("Option List:");
			System.out.println("-------------");
			System.out.println("Add passengers: Enter 0");
			System.out.println("Show seating: Enter 1");
			System.out.println("Quit: Enter \"Quit\"");
			System.out.println();
			String choice = sc.nextLine();
			
			if (choice.equals("0"))
			{
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
								+ "Window, middle, aisle, or none? ");
						String pref = sc.nextLine();
						System.out.print("Enter the number of seats you would like reserved together (up to 3).");
						int together = sc.nextInt();
						
						
						if (pref.equalsIgnoreCase("window"))
						{
							for (int i = 0; i < plane.NUMBER_OF_ECONOMY_CLASS_ROWS + plane.NUMBER_OF_FIRST_CLASS_ROWS; i++)
							{
								if (plane.checkOccupied(flightClass, 1, i))
								{
									
								}
							}
						}
						
						if (pref.equalsIgnoreCase("middle"))
						{
							for (int i = 0; i < plane.NUMBER_OF_ECONOMY_CLASS_ROWS + plane.NUMBER_OF_FIRST_CLASS_ROWS; i++)
							{
								if (plane.checkOccupied(flightClass, 2, i))
								{
									
								}
							}
						}
						
						if (pref.equalsIgnoreCase("aisle"))
						{
							for (int i = 0; i < plane.NUMBER_OF_ECONOMY_CLASS_ROWS + plane.NUMBER_OF_FIRST_CLASS_ROWS; i++)
							{
								if (plane.checkOccupied(flightClass, 3, i))
								{
									
								}
							}
						}
						
						//TODO put seats together if they want to (or just automatically do it if they come in packs)
					}
					else
					{
						System.out.println("That is not a valid option.");
					}
				}
			}
			
			else if (choice.equals("1"))
			{
				Display.printSeating(plane);
			}
			
			else if (choice.equals("Quit"))
			{
				response = choice;
			}
			
			else
			{
				System.out.println("That is not a valid option!");
			}
		}
		sc.close();
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
