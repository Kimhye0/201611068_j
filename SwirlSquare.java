import ch.aplu.turtle.*;

class SwirlSquare{ 
	Turtle t1 = new Turtle();
	void makeSwirlSquare(int size, int bigger, int turns, double degree){
		int evenNumber = 2;
		for(int i=0;i<turns; i++){
			if(i%evenNumber!=0){
				size+=bigger;
			}
			t1.forward(size);
			t1.right(degree);
			}
	}
	public static void main(String[] args) {
		SwirlSquare sq = new SwirlSquare();
		sq.makeSwirlSquare(20,20,10,90);
	}
}


