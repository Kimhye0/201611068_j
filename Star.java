package com.sd.Figure;
import ch.aplu.turtle.*;


public class Star{
	static Turtle t1 = new Turtle();
	public static void drawStar(int size, double x, double y){
		t1.setPos(x,y);
		for(int i=0;i<5;i++){
			t1.forward(size);
			t1.left(144);
		}
	}

	public static void main(String[] args) {
		Star s1 = new Star();
		s1.drawStar(100, 10.0, 70.0); 
	}
}