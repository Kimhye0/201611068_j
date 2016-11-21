public class PopulationAverage{

public static void main(String[] args) {	

	int[][] data={
	    {74425, 76326},
	    {61164, 61636},
	    {109688, 115744},
	    {144796, 146776},
	    {174996, 181676},
	    {177841, 177434},
	    {204630, 205980},
	    {223373, 232245},
	    {161055, 166130},
	    {171576, 176735},
	    {279169, 293772},
	    {239450, 251066},
	    {148690, 156510},
	    {182977, 196992},
	    {237792, 242641},
	    {283869, 296762},
	    {209344, 210282},
	    {118965, 114441},
	    {186503, 186856},
	    {195734, 203014},
	    {254381, 249472},
	    {212401, 229111},
	    {271654, 295354},
	    {319197, 335045},
	    {229829, 231671}
	};

	int man_total= 0;
	int woman_total = 0;
	int man_average = 0;
	int woman_average = 0;

	System.out.println("  Man  Woman");

	for(int i=0; i<data.length; i++){
		for(int j=0; j<data[i].length; j++){
			man_total += data[i][0];
			woman_total += data[i][1];

			System.out.printf( " %d ", data[i][j]);

		}

		System.out.println("\n");
	}
	man_average = man_total/data.length;
	woman_average = woman_total/data.length;

	System.out.println("Man total: "+man_total + " ---> "+ "Man average: " + man_average);
	System.out.println("Woman total: "+woman_total+ " ---> "+ "Woman average: " + woman_average);
}



}