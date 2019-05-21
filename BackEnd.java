import java.util.Scanner;

/**
 * BackEnd.java Class
 * @author Samuel Cotton
 *This Class deals with all of the commands needed for the front end to display the Nodes Arcs and Arrows
 */

public class BackEnd {

	/**
	 * add Arrow Function
	 * @param window4
	 * @param ballArray
	 * @param graphChoice
	 */
	
	
public static void addArrow(GameArena window4, Ball[] ballArray, int graphChoice) {
	/**
	 *
	 *Obtains the GameArena, Ball[], and Graph Choice to then ask the user,
	 *How many Arrows they would like, and which Nodes the arrow will be connecting to
	 *
	 */

		Scanner input2 = new Scanner( System.in );
		System.out.print("How many Arcs do you want? \n");
		/**
		 *@param Answer. The users input to see how many arrows they would like 
		 */
		int Answer = input2.nextInt();
	
		for(int t = 0; t < Answer; t++ ) {
			/**
			 *@param arrowChoice. The Node the user has chosen first
			 *@param arrowChoice2. The Node the user has chosen second
			 */
			System.out.print("Which Node would you like to connect first\n");
			int arrowChoice = input2.nextInt();
	
			System.out.print("Which Node would you like to connect Second\n");
			int arrowChoice2 = input2.nextInt();
	
			/**
			 *@param arrowX. The X location of the Node the user has chosen first
			 *@param arrowY. The Y location of the Node the user has chosen first
			 *
			 *@param arrow2X. The X location of the Node the user has chosen second
			 *@param arrow2Y. The Y location of the Node the user has chosen second
			 */
			
			int arrowX = ballArray[arrowChoice].getXPosition();
			int arrowY = ballArray[arrowChoice].getYPosition();
	
			int arrowX2 = ballArray[arrowChoice2].getXPosition();
			int arrowY2 = ballArray[arrowChoice2].getYPosition();
		
			/**
			 * The object arrow1 is created from the variables used above 
			 */
			
			Arrow arrow1 = new Arrow (arrowX, arrowY+15, arrowX2, arrowY2+15, 3, "WHITE", window4);
		}
		window4.update();
	}
/**
 * Add Text Function
 * @param window4
 * @param ballArray
 * @param graphChoice
 */

public static void addText(GameArena window4, Ball[] ballArray, int graphChoice) {
	
	/**
	 * Loops through each Node in the ballArray and will assign a letter,
	 * From the String array TextChoice which is fed to the string Letter on each loop,
	 * To give each Node a letter
	 */
	
	for(int i = 1; i < graphChoice+1; i++) {
		
		String[] TextChoice = {" ", "A", "B", "C", "D", "E", "F"};
		
		Ball[] ball = new Ball[7];	
		ball = ballArray;
		
		String Letter = TextChoice[i];
	
		/**
		 * @param nodeX. stores the location of the X Co-ordinate from the ballArray value being,
		 * Called using the variable i
		 * @param nodeY. stores the location of the Y Co-ordinate from the ballArray value being,
		 * Called using the variable i
		 */
		
		int nodeX = ballArray[i].getXPosition();
		int nodeY = ballArray[i].getYPosition();
		
		/**
		 * Creates nodeText1 from the variables above
		 */
		
		Text nodeText1 = new Text (20, nodeX-10, nodeY+5, Letter, "BLACK");	

		/**
		 * Adds the Text nodeText1 to the GameArena
		 * Update the GameArena
		 */
		
		window4.addText(nodeText1);
		window4.update();
		}	
}

/**
 * move Node Function
 * 
 * @param window4
 * @param ballArray
 * @param graphChoice
 */
public static void moveNode(GameArena window4, Ball[] ballArray, int graphChoice) {
	
	/**
	 * Takes the Node the user would like to move and gets the new X and Y,
	 * Positions for that node, it then sets that node using the Ball class,
	 * And moves the node, it then asks if you would like to move anymore?
	 */
	
	Scanner input2 = new Scanner( System.in );
	int i = 0;
	
	while( i == 0) {
	
		/**
		 * @param Node. Stores the value of the node the user wants to move
		 */
		
	System.out.print("Which node would you like to move?(1,2,3 etc) \n");
	int Node = input2.nextInt();
	
	/**
	 * @param NodeX. Stores the new X position for the Node and sets it
	 * @param NodeY. Stores the new Y position for the Node and sets it
	 */
	
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

/**
 * Add Arc Function
 * 
 * @param window4
 * @param ballArray
 * @param graphChoice
 */

public static void addArc(GameArena window4, Ball[] ballArray, int graphChoice) {
	
	/**
	 *
	 *Obtains the GameArena, Ball[], and Graph Choice to then ask the user,
	 *How many Arcs they would like, and which Nodes the arc will be connecting to
	 */
	
	Scanner input2 = new Scanner( System.in );
	System.out.print("How many Arcs do you want? \n");
	int Answer = input2.nextInt();

	for(int t = 0; t < Answer; t++ ) {
		
		/**
		 * @param arcChoice. Stores the value of the first Node chosen
		 * @param arcChoice2. Stores the value of the second Node chosen 
		 */
		
		System.out.print("Which Node would you like to connect first\n");
		int arcChoice = input2.nextInt();

		System.out.print("Which Node would you like to connect Second\n");
		int arcChoice2 = input2.nextInt();
		
		/**
		 *@param arcX. The X location of the Node the user has chosen first
		 *@param arcY. The Y location of the Node the user has chosen first
		 *
		 *@param arcX2. The X location of the Node the user has chosen second
		 *@param arcY2. The Y location of the Node the user has chosen second
		 */
		
		int arcX = ballArray[arcChoice].getXPosition();
		int arcY = ballArray[arcChoice].getYPosition();

		int arcX2 = ballArray[arcChoice2].getXPosition();
		int arcY2 = ballArray[arcChoice2].getYPosition();
	
		/**
		 * The object arc1 is created from the variables used above and added,
		 * To the GameArena 
		 */
		
		Line arc1 = new Line (arcX, arcY, arcX2, arcY2, 3, "WHITE");

		window4.addLine(arc1);
	
	}
	window4.update();
}

}
