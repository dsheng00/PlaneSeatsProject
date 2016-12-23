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
			System.out.println("Option List:");
			System.out.println("-------------");
			System.out.println("Add passengers: Enter 1");
			System.out.println("Show seating: Enter 2");
			System.out.println("Quit: Enter \"Quit\"");
			String choice = sc.nextLine();
			
			if (choice.equals("1"))
			{
				System.out.println();
				System.out.print("Would you like to choose or "
								+ "automatically assign seats? ");
				String reChoice = sc.nextLine();
				if (reChoice.equalsIgnoreCase("choose") || reChoice.equalsIgnoreCase("manual"))
				{
					System.out.println();
					System.out.print("First class or economy? ");
					String flightClass = sc.nextLine();
					System.out.println();
					Display.printSeating(plane, flightClass);
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
					
					if (flightClass.equalsIgnoreCase("first"))
					{
						System.out.print("Enter the number of seats you would like reserved together (up to 2). ");
					}
					else
					{
						System.out.print("Enter the number of seats you would like reserved together (up to 3). ");
					}
					
					int together = Integer.parseInt(sc.nextLine());
					
					String pref = "";
					if (together == 1)
					{
						System.out.print("Do you have any seating preference? "
										+ "Window, middle, aisle, or none? ");
						pref = sc.nextLine();	
					}
					
					int rows;
<<<<<<< HEAD
					if (flightClass.equalsIgnoreCase("first")
							|| flightClass.equalsIgnoreCase("1st"))
=======
					int aisles;
					if (flightClass.equalsIgnoreCase("first"))
>>>>>>> origin/master
					{
						rows = plane.NUMBER_OF_FIRST_CLASS_ROWS;
						aisles = plane.NUMBER_OF_FIRST_CLASS_AISLES;
					}
					else
					{
						rows = plane.NUMBER_OF_ECONOMY_CLASS_ROWS;
						aisles = plane.NUMBER_OF_ECONOMY_CLASS_AISLES;
					}
						
					if (together == 3)
					{
						boolean foundSeat = false;
						for (int i = 1; i < rows; i++)
						{
							for (int j = 1; j < aisles - 2; j++)
							{
								if ((foundSeat == false) && !plane.checkOccupied(flightClass, i, j))
								{
									if (!plane.checkOccupied(flightClass, i, j + 1))
									{
										if (!plane.checkOccupied(flightClass, i, j + 2))
										{
											foundSeat = true;
											plane.occupySeat(flightClass, i, j);
											plane.occupySeat(flightClass, i, j + 1);
											plane.occupySeat(flightClass, i, j + 2);
											System.out.println("Seats assigned!");
										}
									}
								}
							}
<<<<<<< HEAD
						}
						Display.printSeating(plane, flightClass);
=======
						}	
>>>>>>> origin/master
					}
				
					else if (together == 2)
					{
						boolean foundSeat = false;
						for (int i = 1; i < rows; i++)
						{
							for (int j = 1; j < aisles - 1; j++)
							{
								if ((foundSeat == false) && !plane.checkOccupied(flightClass, i, j))
								{
									if (!plane.checkOccupied(flightClass, i, j + 1))
									{
										if (!plane.checkOccupied(flightClass, i, j + 2))
										{
											foundSeat = true;
											plane.occupySeat(flightClass, i, j);
											plane.occupySeat(flightClass, i, j + 1);
											System.out.println("Seats assigned!");
										}
									}
								}
							}
						}
						Display.printSeating(plane, flightClass);
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
								System.out.println("Seat assigned!");
							}
							
							if ((foundSeat == false) && !plane.checkOccupied(flightClass, i, aisles))
							{
								foundSeat = true;
								plane.occupySeat(flightClass, i, aisles);
								System.out.println("Seat assigned!");
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
								System.out.println("Seat assigned!");
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
								System.out.println("Seat assigned!");
							}
						}
					}
					
					else
					{
						System.out.println("That is not a valid option.");
					}
				}
			}
			
			else if (choice.equals("2"))
			{
				Display.printSeating(plane, "whole");
			}
			
			else if (choice.equalsIgnoreCase("Quit"))
			{
				response = choice;
				System.out.println("Seat reserving complete.");
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
