class Grade{
	static String score;
	String computeGrade(double marks){
			
		if( 90<=marks&&marks<=100){
			score = "A";
			return score;
		}
		else if (80<=marks&&marks<=90){
			score = "B";
			return score;
		}
		else if (70<=marks&&marks<=80){
			score = "C";
			return score;
		}
		else if (60<=marks&&marks<=70){
			score = "D";
			return score;
		}
		else{
			score = "F";
			return score;
		}
	}


	public static void main(String[] args) {
		Grade g = new Grade();
		double[] marks = {99, 75.5, 10, 50.0, 75.9};
		for(double m:marks){			
			System.out.println(g.computeGrade(m));
		}		
	}
}