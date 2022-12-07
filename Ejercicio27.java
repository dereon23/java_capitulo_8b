package capitulo8b;

public class Ejercicio27 {
	
	public static int[] rotaDerechaArrayInt(int[] ar, int n) {
		int[] ar2=new int[ar.length];
		for(int i=0; i<ar.length;i++) {
			ar2[i]=ar[(i-n)%ar.length];
		}
		return ar2;
	}

}
