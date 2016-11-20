public class Reversed_Hello{

	void reverseString(){
		String h = "Hello";
		char[] chArr = h.toCharArray();

		StringBuilder b = new StringBuilder();

		for(int i=chArr.length-1; i>=0; i--){
			b.append(chArr[i]);
		}
		System.out.println(b);

	}
	public static void main(String[] args) {
		Reversed_Hello r = new Reversed_Hello();
		r.reverseString();
		
	}
}