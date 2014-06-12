
public class parcoursTableauFor {

	public static void main(String[] args) {
		String [][] tableau = new String[2][2];
		tableau[0][0] = "Jean";
		tableau[0][1] = "Lou";
		tableau[1][0] = "Marc";
		tableau[1][1] = "Antoine";
				
		int col, lg;
		for (col=0; col < 2 ; col++)
			{
				for (lg=0 ; lg < 2 ; lg++)
				{System.out.println(tableau[col][lg]);}			
			}

	}

}
