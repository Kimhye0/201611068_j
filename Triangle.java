package com.sd.Figure;
import ch.aplu.turtle.*;


public class Triangle{
	static Turtle t1 = new Turtle();
	public static void drawTriangle(int size, double x, double y){
		t1.setPos(x,y);
		for(int i=0;i<3;i++){
			t1.forward(size);
			t1.left(120);
		}
	}

	public static void main(String[] args) {
		Triangle s1 = new Triangle();
		s1.drawTriangle(100, 10.0, 70.0); 
	}
}