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
			System.out.print("Business or economy?");
			//chooses business or economy
			System.out.print("Do you have any seating preference? "
								+ "Window, aisle, or middle? ");
			String pref = sc.next();
			//method that makes preferences using contain()
			//method(s) assigns seats
		}
		sc.close();	
	}
}
