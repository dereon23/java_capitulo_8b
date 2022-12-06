package capitulo8b;

public class Ejercicio23 {
	
	public static int mediaArrayInt(int[] ar) {
		int media=0;
		for(int i=0; i<ar.length;i++) {
			media+=ar[i];
		}
		return media/ar.length;
	}

}
