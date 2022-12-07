package capitulo8b;

public class Ejercicio26 {
	
	public static int[] volteaArrayInt(int[] ar) {
		int aux;
		for(int i=0; i<ar.length/2;i++) {
			aux=ar[i]; ar[i]=ar[ar.length-1-i]; ar[ar.length-1-i]=aux;
		}
		return ar;
	}

}
