package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot jjjj = new Robot();
		jjjj.setSpeed(400);
		jjjj.setPenColor(70,150,150);
		jjjj.setPenWidth(50);
		jjjj.penDown();
		for (int i = 0; i < 4; i++) {
		jjjj.move(100);	
		jjjj.turn(90);
		}
		
		for (int i = 0; i < 5; i++) {
		jjjj.move(100);	
		jjjj.turn(75);
		jjjj.move(100);
		jjjj.turn(213);
		}
		
		
		
		
		
		
		
	}
}
