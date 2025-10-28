package h2;

public class H2_main {
	public static void main(String[] args) {
		int i = 1, j = 2, k = 3, min = 4, max = 5;
		
		if (i < j && i < k) {
			min = i;
		} 
		else if (j < i && j < k) {
			min = j;
		}
		else {
			min = k;
		}
		System.out.println("Minimum ist: " + min); //optional
		
		if (i > j && i > k) {
			max = i;
		} 
		else if (j > i && j > k) {
			max = j;
		}
		else {
			max = k;
		}
		System.out.println("Maximum ist: " + max); //optional
	}
}
