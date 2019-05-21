import java.util.Scanner;

public class MoveNode {

	public static void Move(GameArena window4, Ball[] ballArray, int graphChoice) {
		
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
}
