import java.util.Scanner;

public class AddArc {

	public static void add(GameArena window4, Ball[] ballArray, int graphChoice) {
		
		Scanner input2 = new Scanner( System.in );
		System.out.print("How many Arcs do you want? \n");
		int Answer = input2.nextInt();
	
		for(int t = 0; t < Answer; t++ ) {
			System.out.print("Which Node would you like to connect first\n");
			int arcChoice = input2.nextInt();
	
			int arcX = ballArray[arcChoice].getXPosition();
			int arcY = ballArray[arcChoice].getYPosition();
	
			System.out.print("Which Node would you like to connect Second\n");
			int arcChoice2 = input2.nextInt();
	
			int arcX2 = ballArray[arcChoice2].getXPosition();
			int arcY2 = ballArray[arcChoice2].getYPosition();
		
			Line arc1 = new Line (arcX, arcY, arcX2, arcY2, 3, "WHITE");
	
			window4.addLine(arc1);
		
		}
		window4.update();
	}
	
}
