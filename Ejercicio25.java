package capitulo8b;

public class Ejercicio25 {
	
	public static int estaEnArrayInt(int n,int[] ar) {
		int pos=-1;
		for(int i=0; i<ar.length;i++) {
			if(ar[i]==n) {
				pos=i;
				break;
			}
		}
		return pos;
	}
	
}
