package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	StdDraw.setPenColor(Color.MAGENTA);
	StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
	
	StdDraw.setPenColor(Color.WHITE);
	StdDraw.arc(0.1, 0.7, 0.05, 0, 180);
	StdDraw.arc(0.2, 0.7, 0.05, 0, 180);
	StdDraw.line(0.05, 0.7, 0.05, 0.69);
	StdDraw.line(0.25, 0.7, 0.25, 0.69);
	StdDraw.line(0.05, 0.69, 0.15, 0.57);
	StdDraw.line(0.15, 0.57, 0.25, 0.69);
		
	}
}