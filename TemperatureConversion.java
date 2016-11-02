
class TemperatureConversion{
	void conversion(float temperature, String fc){
		float t;

		if (fc.equals("F")){
			t = (temperature-32)/1.8f;
			System.out.println("Centigrade:"+t+"C");
		}
		else if (fc.equals("C")){
			t = (temperature*1.8f)+32;
			System.out.println("Fahrenheit"+t+"F");
		}
	}




	public static void main(String[] args) {
		TemperatureConversion t1 = new TemperatureConversion();
		t1.conversion(60,"F");
		
	}

}