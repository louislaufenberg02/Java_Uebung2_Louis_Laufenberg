package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 201, j = 101, k = 3;
		
		boolean eins;
		eins = i > j;
		
		boolean zwei;
		zwei = i > 200;
		
		boolean drei;
		drei = j > 100;
		
		k = -10;
		
		if (eins == true && zwei == false && drei == false) {
			k = 1;
		}
		else if (eins == true && zwei == true && drei == false) {
			k = 2;
		}
		else if (eins == true && zwei == true && drei == true) {
			k = 3;
		}
		else if (eins == false && zwei == false && drei == false) {
			k = 4;
		}
		System.out.println(k); 
	}
}
