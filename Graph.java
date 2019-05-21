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
	public static void main (String[] args) throws InterruptedException
	{
		
		Graph g = new Graph();
		
	}
	
	Graph(){
	
		Graph4();

	}

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
			System.out.print("What Would you like to do?\n 1 = Move Node  \n 2 = Add Text \n 3 = Add Arc\n 4 = exit\n");
			int Choice = input2.nextInt();
	
		
			if(Choice == 1) {
				MoveNode(window4, ballArray, Choice);
				}	
			
			else if (Choice == 2) {
				
			TextNode.add(window4, ballArray, graphChoice);
			
			}
			else if (Choice == 3) {
				addArc(window4, ballArray, graphChoice);
			}
			else if (Choice == 4) {
				System.out.print("Exit");
				Y = 0;
				System.exit(0);
			}
			else {
				System.out.print("Please Enter One of the following numbers");
			}
		
		}
				
	}

	private void MoveNode(GameArena window4, Ball ballArray[], int graphChoice) {

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

	
	private void addArc( GameArena window4, Ball ballArray[], int graphChoice) {
		
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
