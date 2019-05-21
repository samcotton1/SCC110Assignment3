import java.util.Scanner;

public class TextNode {



	public static void add(GameArena window4, Ball[] ballArray, int graphChoice) {
		
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
}
