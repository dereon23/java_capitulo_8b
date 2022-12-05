package capitulo8b;

public class Ejercicio20 {
	
	public static int[] generaArrayInt(int n, int min, int max) {
		int[] ar =new int[n];
		for(int i=0; i<n; i++) {
			ar[i]=(int)(Math.random()*(max-min)+min);
		}
		return ar;
	}
	
}
