package com.sd.Figure;
import ch.aplu.turtle.*;


public class SquareAt{
	static Turtle t1 = new Turtle();
	public static void drawSquare(int size, double x, double y){
		t1.setPos(x,y);
		for(int i=0;i<4;i++){
			t1.forward(size);
			t1.left(90);
		}
	}

	public static void main(String[] args) {
		SquareAt d1 = new SquareAt();
		d1.drawSquare(100, 50.0, 70.0); 
	}
}
