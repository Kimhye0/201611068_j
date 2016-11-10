import java.util.ArrayList;

class Simple_Numbers{
	int i;

	void isDivided4and5(){
		ArrayList arr = new ArrayList();
		// int[] x = new int[];
		for (i=1;i<=1000;i++ ) {
			if (i%4==0 && i%5!=0 && i%5!=5) {
				arr.add(i);				
			}					
		}
		System.out.println(arr);
	}
	public static void main(String[] args) {
		Simple_Numbers n = new Simple_Numbers();
		n.isDivided4and5();
	}

	
}