class Rspgame{

	static void playGame(String x, String y){
		if (x.equals("r")) {
			if (y.equals("r")) {
				System.out.println("draw");
			}
			else if (y.equals("s")){
				System.out.println("r - win");
			}
			else if (y.equals("p")){
				System.out.println("p - win");
			}						
		}
		else if (x.equals("s")) {
			if (y.equals("s")) {
				System.out.println("draw");
			}
			else if (y.equals("p")){
				System.out.println("s - win");
			}
			else if (y.equals("r")){
				System.out.println("r - win");
			}						
		}
		else if (x.equals("p")) {
			if (y.equals("p")) {
				System.out.println("draw");
			}
			else if (y.equals("r")){
				System.out.println("p - win");
			}
			else if (y.equals("s")){
				System.out.println("s - win");
			}						
		}
		else{
			System.out.println("error");
		}


	}

	public static void main(String[] args) {
		Rspgame r = new Rspgame();
		r.playGame("r","r");
		r.playGame("s","p");
	}


}