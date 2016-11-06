class Bmi{
	void calculateBmi(float weight, float height){
		float bmi = weight / (height*height);

		if (bmi < 18.5) {
			System.out.println("low");					
		}
		else if (18.5<=bmi && bmi<23){
			System.out.println("normal");
		}
		else if (23<=bmi && bmi<25){
			System.out.println("risky");
		}
		else if (25<=bmi && bmi<30){
			System.out.println("obesity 1");
		}
		else if (30<=bmi && bmi<40){
			System.out.println("obesity 2");
		}
		else if (bmi>40){
			System.out.println("obesity 3");
		}
		else{
			System.out.println("Error");
		}


	}

	public static void main(String[] args) {
		Bmi b = new Bmi();
		b.calculateBmi((float)85.7,(float)1.65);
		
	}
}