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
		Scanner input = new Scanner( System.in );
		System.out.print("Hello and welcome to the Node and Arc Learning Resource \nPlease Enter 1, 2, 3 for static examples or 4 to create your own  \n");
		int graphChoice = input.nextInt();
		for(int i = 0; i <= 5; i++) {
			if(graphChoice == 1) {
				Graph1();
			}else if(graphChoice == 2) {
				Graph2();
			}else if (graphChoice == 3) {
				Graph3();
			}else if (graphChoice == 4) {
				Graph4();
			}else {
				System.out.print("Please Re-enter 1, 2, 3, 4");
			}
		}
	}

	public void Graph1() {
		
		GameArena window = new GameArena(500,500);
		
		Line line1 = new Line(170, 200, 270, 200, 3, "BLUE");
		Line line2 = new Line(170, 300, 270, 300, 3, "GREEN");
		Line line3 = new Line(150, 200, 150, 300, 3, "RED");
		Line line4 = new Line(290, 200, 290, 300, 3, "YELLOW");
		
		
		Ball ball1 = new Ball(150, 200, 20, "BLUE");
		Ball ball2 = new Ball (290, 200, 20, "YELLOW");
		Ball ball3 = new Ball(150, 300, 20, "RED");
		Ball ball4 = new Ball (290, 300, 20, "GREEN");
		

		window.addLine(line1);
		window.addLine(line2);
		window.addLine(line3);
		window.addLine(line4);
		
		window.addBall(ball1);
		window.addBall(ball2);
		window.addBall(ball3);
		window.addBall(ball4);
		
		Text text1 = new Text (20, 145, 205, "A", "BLACK");
		Text text2 = new Text (20, 285, 205, "B", "BLACK");
		Text text3 = new Text (20, 145, 305, "C", "BLACK");
		Text text4 = new Text (20, 285, 305, "D", "BLACK");
		
		window.addText(text1);
		window.addText(text2);
		window.addText(text3);
		window.addText(text4);
		
		window.update();
		
		
	}	
	

	private void Graph2() {
		GameArena window = new GameArena(500,500);

		Line line1 = new Line(125, 200, 275, 225, 3, "BLUE");
		Line line2 = new Line(275, 225, 425, 275, 3, "RED");
		Line line3 = new Line (125, 200, 150, 300, 3, "BLUE");
		Line line4 = new Line (150, 300, 285, 350, 3, "GREEN");
		Line line5 = new Line (285, 350, 425, 275, 3, "YELLOW");
		Line line6 = new Line (275, 225, 150, 300, 3, "RED");
		Line line7 = new Line (285, 350, 275, 225, 3, "YELLOW");
		
		Ball ball1 = new Ball (125, 200, 20, "BLUE");
		Ball ball2 = new Ball (275, 225, 20, "RED");
		Ball ball3 = new Ball (150, 300, 20, "GREEN");
		Ball ball4 = new Ball (285, 350, 20, "YELLOW");
		Ball ball5 = new Ball (425, 275, 20, "PINK");
		
		window.addLine(line1);
		window.addLine(line2);
		window.addLine(line3);
		window.addLine(line4);
		window.addLine(line5);
		window.addLine(line6);
		window.addLine(line7);
		
		window.addBall(ball1);
		window.addBall(ball2);
		window.addBall(ball3);
		window.addBall(ball4);
		window.addBall(ball5);
		
		Text text1 = new Text (20, 120, 205, "A", "BLACK");
		Text text2 = new Text (20, 265, 230, "B", "BLACK");
		Text text3 = new Text (20, 145, 305, "C", "BLACK");
		Text text4 = new Text (20, 280, 3, "D", "BLACK");
		Text text5 = new Text (20, 420, 280, "D", "BLACK");
		
		window.addText(text1);
		window.addText(text2);
		window.addText(text3);
		window.addText(text4);
		window.addText(text5);
		window.update();
		
		
	}
	
	private void Graph3() {
		
		GameArena window = new GameArena(500,500);

		Line line1 = new Line(360, 200, 190, 325, 3, "GREEN");
		Line line2 = new Line(360, 200, 280, 370, 3, "GREEN");
		Line line3 = new Line (75, 200, 190, 325, 3, "BLUE");
		Line line4 = new Line (280, 370, 115, 110, 3, "RED");
		Line line5 = new Line (115, 110, 75, 200, 3, "PINK");
		Line line6 = new Line (185, 325, 355, 198, 3, "YELLOW");
		Line line7 = new Line (280, 370, 190, 325, 3, "RED");
		Line line8 = new Line (360, 200, 115, 110, 3, "PINK");
				
		Ball ball1 = new Ball (75, 200, 20, "BLUE");
		Ball ball2 = new Ball (360, 200, 20, "GREEN");
		Ball ball3 = new Ball (190, 325, 20, "YELLOW");
		Ball ball4 = new Ball (280, 370, 20, "RED");
		Ball ball5 = new Ball (115, 110, 20, "PINK");
		
		window.addLine(line1);
		window.addLine(line2);
		window.addLine(line3);
		window.addLine(line4);
		window.addLine(line5);
		window.addLine(line6);
		window.addLine(line7);
		window.addLine(line8);
		
		window.addBall(ball1);
		window.addBall(ball2);
		window.addBall(ball3);
		window.addBall(ball4);
		window.addBall(ball5);
		
		Text text1 = new Text (20, 70, 200, "A", "BLACK");
		Text text2 = new Text (20, 355, 200, "B", "BLACK");
		Text text3 = new Text (20, 185, 325, "C", "BLACK");
		Text text4 = new Text (20, 275, 370, "D", "BLACK");
		Text text5 = new Text (20, 110, 110, "E", "BLACK");
		
		window.addText(text1);
		window.addText(text2);
		window.addText(text3);
		window.addText(text4);
		window.addText(text5);
		
		window.update();
		
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
				TextNode(window4, ballArray, graphChoice);
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

	private void TextNode( GameArena window4, Ball ballArray[], int graphChoice) {
			
		Scanner input2 = new Scanner( System.in );
		
		for(int i = 0; i < graphChoice; i++) {
	
			String[] TextChoice = {"A", "B", "C", "D", "E", "F"};
			Ball[] ball = new Ball[7];	
			ball = ballArray;
			
			System.out.print("Which node do you want to choose? \n");
			int NodeChoice = input2.nextInt();
				
			String Letter = TextChoice[i];
		
			int nodeX = ballArray[NodeChoice].getXPosition();
			int nodeY = ballArray[NodeChoice].getYPosition();
			
			Text nodeText1 = new Text (20, nodeX-10, nodeY+5, Letter, "BLACK");	

			window4.addText(nodeText1);
	
		}
		
		window4.update();
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




