import java.util.Scanner;

public class SeatingCreator
{
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
			String choice = sc.nextLine();
			
			if (choice.equals("0"))
			{
				System.out.print("Would you like to choose or "
								+ "automatically assign seats? ");
				String reChoice = sc.nextLine();
				if (reChoice.equalsIgnoreCase("choose") || reChoice.equalsIgnoreCase("manual"))
				{
					System.out.print("First class or economy? ");
					String flightClass = sc.nextLine();
					System.out.print("Please enter your choice of row: ");
					String row = sc.nextLine();
					System.out.print("Please enter your choice of column: ");
					String column = sc.nextLine();
					plane.occupySeat(flightClass, rowToInt(row), Integer.parseInt(column));
					System.out.println("Seat assigned!");
				}
					
				else if (reChoice.substring(0, 4).equalsIgnoreCase("auto"))
				{
					System.out.print("First or economy class? ");
					String flightClass = sc.nextLine();
					
					System.out.print("Enter the number of seats you would like reserved together (up to 3). ");
					int together = Integer.parseInt(sc.nextLine());
					
					String pref = "";
					if (together == 1)
					{
						System.out.print("Do you have any seating preference? "
										+ "Window, middle, aisle, or none? ");
						pref = sc.nextLine();	
					}
					
					int rows;
					if (flightClass.equalsIgnoreCase("first"))
					{
						rows = plane.NUMBER_OF_FIRST_CLASS_ROWS;
					}
					else
					{
						rows = plane.NUMBER_OF_ECONOMY_CLASS_ROWS;
					}
						
					if (together == 3)
					{
						for (int i = 1; i < rows; i++)
						{
							if (!plane.checkOccupied(flightClass, i, 1))
							{
								if (!plane.checkOccupied(flightClass, i, 2))
								{
									if (!plane.checkOccupied(flightClass, i, 3))
									{
										plane.occupySeat(flightClass, i, 1);
										plane.occupySeat(flightClass, i, 2);
										plane.occupySeat(flightClass, i, 3);
									}
								}
							}
						}
					}
					
					else if (together == 2)
					{
						for (int i = 1; i < rows; i++)
						{
							if (!plane.checkOccupied(flightClass, i, 1))
							{
								if (!plane.checkOccupied(flightClass, i, 2))
								{
									plane.occupySeat(flightClass, i, 1);
									plane.occupySeat(flightClass, i, 2);
								}
								
							}
							
							if (!plane.checkOccupied(flightClass, i, 2))
							{
								if (!plane.checkOccupied(flightClass, i, 3))
								{
									plane.occupySeat(flightClass, i, 2);
									plane.occupySeat(flightClass, i, 3);
								}
								
							}
						}
					}
					
					else if (pref.equalsIgnoreCase("window"))
					{
						boolean foundSeat = false;
						for (int i = 1; i < rows; i++)
						{
							if ((foundSeat == false) && !plane.checkOccupied(flightClass, i, 1))
							{
								foundSeat = true;
								plane.occupySeat(flightClass, i, 1);
							}
						}
					}
						
					else if (pref.equalsIgnoreCase("middle"))
					{
						boolean foundSeat = false;
						for (int i = 1; i < rows; i++)
						{
							if ((foundSeat == false) && !plane.checkOccupied(flightClass, i, 2))
							{
								foundSeat = true;
								plane.occupySeat(flightClass, i, 2);
							}
						}
					}
						
					else if (pref.equalsIgnoreCase("aisle"))
					{
						boolean foundSeat = false;
						for (int i = 1; i < rows; i++)
						{
							if ((foundSeat == false) && !plane.checkOccupied(flightClass, i, 3))
							{
								foundSeat = true;
								plane.occupySeat(flightClass, i, 3);
							}
						}
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

	private static int rowToInt(String row)
	{
		Character c = row.charAt(0);
		return Character.getNumericValue(c) - 9;
	}
}
