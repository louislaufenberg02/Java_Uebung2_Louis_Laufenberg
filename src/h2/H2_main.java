package h2;

public class H2_main {
	public static void main(String[] args) {
		int i = 1, j = 100, k = 101, min = 4, max = 5;
		
		min = i;
		max = i;
		
		if (j < min) {
			min = j;
		} 
		if (k < min) {
			min = k;
		} 
		System.out.println("Minimum ist: " + min); //optional
		
		if (j > max) {
			max = j;
		} 
		if (k > max) {
			max = k;
		} 
		System.out.println("Maximum ist: " + max); //optional
	}
}
