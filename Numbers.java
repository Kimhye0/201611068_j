import java.util.ArrayList;

class Numbers{

	Numbers(){};
	
	ArrayList<Integer> myList = new ArrayList<Integer>();

	void setNumbers(){
		int i;		
		for (i=1;i<=1000;i++ ) {
			if (i%4==0 && i%5!=0) {
				myList.add(i);				
			}					
		}
	}

	int sumList(){
		int sum=0;
		for(int j:myList){
			sum+=j;
		}
		return sum;
	}


	public static void main(String[] args) {
		Numbers n = new Numbers();
		n.setNumbers();
		System.out.println("sum:" + n.sumList());
	}

	
}