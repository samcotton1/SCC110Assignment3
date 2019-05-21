import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javafx.event.*;
import javafx.scene.*;
import java.util.Scanner;
import java.util.Random;

public class Graph {

	public void Graph4() {
	 GameArena window4 = new GameArena(500,500);	
		
		Ball[] ballArray = new Ball[7];
		Line[] lineArray = new Line[7];
		Text[] textArray = new Text[7];
		
		Scanner input2 = new Scanner( System.in );
		int graphChoice = 0;
		
		
		String[] TextChoice = {"A", "B", "C", "D", "E", "F"};
		System.out.print("How many Nodes would you like? (5 max)  \n");
		graphChoice = input2.nextInt();
		
		for(int i = 1; i <= graphChoice; i++) {
			
			Random rand = new Random();

			int ball1X = rand.nextInt(450);
			int ball1Y = rand.nextInt(450);
						
			int ball2X = rand.nextInt(450);
			int ball2Y = rand.nextInt(450);
	
			ballArray[i]  = new Ball(ball1X, ball1Y, 20, "BLUE");
					
			window4.addBall(ballArray[i]);
						
		}
		window4.update();
		int Y = 1;
		
		while (Y == 1) {
			System.out.print("What Would you like to do?\n 1 = Move Node  \n 2 = Add Text \n 3 = Add Arc\n 4 = Add Arrows \n 5 = exit\n");
			int Choice = input2.nextInt();
	
			if(Choice == 1) {
				BackEnd.moveNode(window4, ballArray, graphChoice);
			}	
			
			else if (Choice == 2) {
				BackEnd.addText(window4, ballArray, graphChoice);
			}
			else if (Choice == 3) {
				BackEnd.addArc(window4, ballArray, graphChoice);
			}
			else if (Choice == 4) {
				BackEnd.addArrow(window4, ballArray, graphChoice);
			}
			else if (Choice == 5) {
				System.out.print("Exit");
				Y = 0;
				System.exit(0);
			}
			else {
				System.out.print("Please Enter One of the following numbers");
			}
		}		
	}
}
