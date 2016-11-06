class LeapYear{
	static void getLeapYear(int[] year){
		for(int y:year){
			if(((y%4 ==0) && (y%100 != 0) || (y% 400) ==0)){
				System.out.println("a leap year:"+y);
			}
			else{
				System.out.println("not a leap year: "+y);
			}
		}
	}

	public static void main(String[] args) {
		LeapYear l = new LeapYear();
		int[] year = {2000,2016,1995,1998,1969,100};
		l.getLeapYear(year);
	}
	
}