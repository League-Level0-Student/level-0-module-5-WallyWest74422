package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	static Robot Zane = new Robot();

	public static void main(String[] args) {
		
		//1. Create a new Robot

		//2. Set the speed to 100
Zane.setSpeed(100);
Zane.turn(-90);
Zane.move(400);
Zane.turn(90);
		int colorChoice=JOptionPane.showOptionDialog(null, "Please select a color!", "POLYGON MAKER", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Blue","Red", "Green", "Purple"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice==0){
			Zane.setPenColor(0, 0, 255);
		}else if(colorChoice==1) {
			Zane.setPenColor(255, 0, 0);
		}else if(colorChoice==2){
			Zane.setPenColor(0, 255, 0);
		}else {
			Zane.setPenColor(100, 0, 100);
		}
		//4. Ask the user how many polygons they want to be drawn.
	String POLY=JOptionPane.showInputDialog("How many polygons would you like to be drawn");
	int poly = Integer.parseInt(POLY);
		//5. Use the robot to draw the number of polygons the user requested.
		for(int i=0; i<poly; i++) {
			for(int j=0; j<3;j++) {
				Zane.penDown();
				Zane.move(100);
				Zane.turn(120);
			}
			Zane.penUp();
			Zane.turn(50);
			Zane.move(200);
			Zane.turn(-25);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

