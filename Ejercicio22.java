package capitulo8b;

public class Ejercicio22 {
	
	public static int maximoArrayInt(int[] ar) {
		int max=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		return max;
	}

}
