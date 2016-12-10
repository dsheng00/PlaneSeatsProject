public class SeatingArrayTester 
{
	public static void main(String[] args)
	{
		Airplane boeing = new Airplane();
		boeing.occupySeat("first", 2, 3);
		boeing.occupySeat("economy", 1, 3);
		Display.printSeating(boeing);
		
		/* For later use
		Airplane boeing1337 = new Airplane();
		System.out.println(boeing1337.getSeatValue("first", 2, 3));
		boeing1337.occupySeat("first", 2, 3);
		System.out.println(boeing1337.getSeatValue("first", 2, 3));
		*/
	}
}
