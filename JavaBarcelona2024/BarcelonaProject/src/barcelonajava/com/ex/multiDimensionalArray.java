package barcelonajava.com.ex;

public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] Altman = {
				{"Ocasla", "223503120310", "04/22/2007", "17", "Male"},
				{"Villanigga", "136633101005", "02/13/2005", "19", "uncle"},
				{"Castillo", "133635130192", "01/25/2007", "17", "Male"},
				{"Broqueza", "483526150105", "01/10/2007", "17", "Male"},
				{"Galpo", "136635140514", "07/17/2007", "17", "Male"},
				{"Brix", "13121410067", "01/18/2005", "19", "Male"},
				{"Bolibol", "1087371802131", "11/15/2006", "17", "Female"},
				{"Sosmena", "406459150148", "07/02/2007", "17", "Male"},
				{"Brusas", "136633160208", "09/22/2005", "19", "Male"},
				{"Bonifacio", "136635120950", "07/5/2007", "17", "Male"}
				
		};
		System.out.println(Altman[3][1]);
		for(String[] row : Altman) {
			for (String i : row) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}

}
