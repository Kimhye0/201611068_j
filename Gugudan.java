class Gugudan{

	static int[] x={1,2,3,4,5,6,7,8,9};

	void makegugudan(){

	for(int i:x){
		System.out.printf("\n%d dan :", i);
		for(int j:x){
			System.out.printf("\t%dx%d=%2d",i,j,i*j);
		}
	}
	}

	public static void main(String[] args) {
		Gugudan g = new Gugudan();
		g.makegugudan();

	}
}