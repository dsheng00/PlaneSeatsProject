import java.util.Scanner;

public class SeatingCreator 
{
	public static void main(String args[])
	{
		final String SENTINEL = "N"; //change depending on the question
		String response = "";
		Scanner sc = new Scanner(System.in);

		while (!response.equalsIgnoreCase(SENTINEL)) 
		{	
			//some display method displaying the airplane layout
			System.out.print("Please enter the number of seats "
								+ "you would like to reserve: ");
			int num = sc.nextInt();
			//method that takes the number of people
			System.out.print("Please enter the names that the seats will go under "
					+ "(in order): ");
			String names = sc.next(); //correspond each seat with a name
			//turn the list of names into an array
			//loop for the below questions for each name?
			System.out.print("Business or economy for names?"); 
			//chooses business or economy
			System.out.print("Do you have any seating preference? "
					+ "Window, aisle, or middle? ");
			String pref = sc.next();
			//method that makes preferences using contain()
			//method(s) assigns seats
			//print the layout given with corresponding names
			System.out.print("Continue? Y/N: ");
			response = sc.next();
		}
		sc.close();	
	}
}
