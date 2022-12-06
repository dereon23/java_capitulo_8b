package capitulo8b;

public class Ejercicio24 {

	public static boolean estaEnArrayInt(int n,int[] ar) {
		boolean esta=false;
		for(int i=0; i<ar.length;i++) {
			if(ar[i]==n) {
				esta=true;
				break;
			}
		}
		return esta;
	}
}
