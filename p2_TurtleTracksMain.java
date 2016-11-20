import ch.aplu.turtle.*;
import java.util.ArrayList;

public class p2_TurtleTracksMain{
	void drawSquareAt(){
		Turtle t1 = new Turtle();
		ArrayList<Double[]> posArr = new ArrayList<Double[]>();
		Double[] pos = new Double[2];
		for(int i=0; i<4; i++){
			pos[0] = t1.getX();
			pos[1] = t1.getY();
			posArr.add(pos);
			t1.forward(45);
			t1.right(90);
		}
		// pos[0] = 10.0;
		// pos[1] = 50.0;
		
		for(Double[] d:posArr){
			System.out.printf((" %.1f, %.1f "), d[0],d[1]);
		}

	}
	public static void main(String[] args) {
		p2_TurtleTracksMain p2 = new p2_TurtleTracksMain();
		p2.drawSquareAt();
	}
}