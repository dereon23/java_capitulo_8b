package capitulo8b;

public class Ejercicio21 {
	
	public static int minimoArrayInt(int[] ar) {
		int min=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		return min;
	}
}
