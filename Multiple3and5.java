class Multiple3and5{
	public static void main(String[] args) {
		int num=1, sum=0;

		while(num<=1000){
			if(num%3==0 && num%5==0){
				System.out.println(num);
				sum+=num;
			}
			num++;
		}
		System.out.println("sum :" + sum);
	}
}