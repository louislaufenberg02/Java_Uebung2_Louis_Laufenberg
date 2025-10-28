package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 1, j = 2, k = -10;
		
		boolean eins;
		eins = i > j;
		
		boolean zwei;
		zwei = i > 200;
		
		boolean drei;
		drei = j > 100;
		
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
		else {
			k = -10; //falls k initiell ungleich -10 wäre
		}
		System.out.println(k); //optional
	}
}
