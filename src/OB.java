
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class OB {
	static Robot zane=new Robot("batman");
public static void main(String[] args) {
	
	String shape =	JOptionPane.showInputDialog("What shape do you want? Options are Square, Circle, and Triangle");
	String color =	JOptionPane.showInputDialog("Which color would you like? Options are Red, Green, and Blue");

		if(color.equals("Red")) {
			zane.penDown();
		zane.setPenColor(Color.red);
		}else if(color.equals("Green")) {
			zane.penDown();
			zane.setPenColor(0, 255, 0);
		}else if(color.equals("Blue")) {
			zane.penDown(); 
			zane.setPenColor(0, 0, 255);
		}
		if(shape.equals("Square")) {
			drawSquare();
		}else if(shape.equals("Triangle")) {
			drawTriangle();
		}else if(shape.equals("Circle")) {
			drawCircle();
		}
	}	
		public static void drawSquare() {	
			zane.setSpeed(100);
			zane.penDown();
			for(int i=1;i<5;i++) {
				zane.turn(90);
				zane.move(100);}
		}
		public static void drawTriangle() {
			zane.setSpeed(100);
			zane.penDown();
			for(int i=1;i<4;i++) {
				zane.turn(120);
				zane.move(100);}
		}
		public static void drawCircle() {
			zane.setSpeed(250);
			zane.penDown();
			for(int i=1;i<361;i++) {
				zane.turn(1);
				zane.move(1);}
	
}
}
