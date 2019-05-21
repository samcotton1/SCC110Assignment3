import java.util.Scanner;

public class BackEnd {

	
/**
 *
 *Obtains the GameArena, Ball[], and Graph Choice to then ask the user,
 *How many Arrows they would like, and which Nodes the arrow will be connecting to
 *
 *@param arrowChoice. The Node the user has chosen first
 *@param arrowChoice2. The Node the user has chosen second
 *
 *@param Answer. The users input to see how many arrows they would like 
 *
 *@param arrowX. The X location of the Node the user has chosen first
 *@param arrowY. The Y location of the Node the user has chosen first
 *
 *@param arrow2X. The X location of the Node the user has chosen second
 *@param arrow2Y. The Y location of the Node the user has chosen second
 *
 */
public static void addArrow(GameArena window4, Ball[] ballArray, int graphChoice) {
		
		Scanner input2 = new Scanner( System.in );
		System.out.print("How many Arcs do you want? \n");
		int Answer = input2.nextInt();
	
		for(int t = 0; t < Answer; t++ ) {
			System.out.print("Which Node would you like to connect first\n");
			int arrowChoice = input2.nextInt();
	
			int arrowX = ballArray[arrowChoice].getXPosition();
			int arrowY = ballArray[arrowChoice].getYPosition();
	
			System.out.print("Which Node would you like to connect Second\n");
			int arrowChoice2 = input2.nextInt();
	
			int arrowX2 = ballArray[arrowChoice2].getXPosition();
			int arrowY2 = ballArray[arrowChoice2].getYPosition();
		
			Arrow arc1 = new Arrow (arrowX, arrowY+15, arrowX2, arrowY2+15, 3, "WHITE", window4);
	
		
		}
		window4.update();
	}

public static void addText(GameArena window4, Ball[] ballArray, int graphChoice) {
	
	for(int i = 1; i < graphChoice+1; i++) {
		
		String[] TextChoice = {" ", "A", "B", "C", "D", "E", "F"};
		
		Ball[] ball = new Ball[7];	
		ball = ballArray;
		
		String Letter = TextChoice[i];
	
		int nodeX = ballArray[i].getXPosition();
		int nodeY = ballArray[i].getYPosition();
		
		Text nodeText1 = new Text (20, nodeX-10, nodeY+5, Letter, "BLACK");	

		window4.addText(nodeText1);
		window4.update();
		}	
}

public static void moveNode(GameArena window4, Ball[] ballArray, int graphChoice) {
	
	Scanner input2 = new Scanner( System.in );
	int i = 0;
	
	while( i == 0) {
	System.out.print("Which node would you like to move?(1,2,3 etc) \n");
	int Node = input2.nextInt();
	
	System.out.print("Please enter the X Coordinates? \n");
	int NodeX = input2.nextInt();
	ballArray[Node].setXPosition(NodeX);
	
	System.out.print("Please Enter the Y Coordinates \n");
	int NodeY = input2.nextInt();
	ballArray[Node].setXPosition(NodeY);	
	
	window4.update();
	
	System.out.print("Would you like to move another?(0 = Yes 1 == No)\n");
	int YorN = input2.nextInt();
		if(YorN == 1) {
	
			break;
		
		}
		else{
		
		}	
	}	
	
}	

public static void addArc(GameArena window4, Ball[] ballArray, int graphChoice) {
	
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
