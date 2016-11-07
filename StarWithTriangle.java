class StarWithTriangle{

	static StringBuffer sbuf = new StringBuffer();
	static String white = "";

	void drawTriangleWithChar(int height, String symbol){
		for(int i=0; i<height; i++){
			for(int j=0; j<(height-1); j++){
				sbuf.append(white);
			}		
			for(int j=0; j<i*2+1;j++){
				sbuf.append(symbol);
			}
			System.out.printf("%s\n", sbuf.toString());
			sbuf.delete(0,sbuf.length());
		}

	}


	public static void main(String[] args) {
		StarWithTriangle s = new StarWithTriangle();
		s.drawTriangleWithChar(10,"*");


	}

}