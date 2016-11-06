import java.util.Calendar;
class MonthOfSunday{
	void countSunday(){
		int sunday = 0;
		Calendar c = Calendar.getInstance(); 
		for(int i = 1901; i<=2000; i++){
			for(int j=0; j<12; j++){
				c.set(i,j,1);
				if(c.get(Calendar.DAY_OF_WEEK) == 1){
					sunday++;
				}
			}
		}
		System.out.println("20C first sunday:"+sunday);
	}
	public static void main(String[] args) {
		MonthOfSunday m = new MonthOfSunday();
		m.countSunday();
		
	}

}