import java.util.Arrays;
import java.util.Collections;

//Consigo fazer "herança multipla" em java, usando interfaces.
public class OrdenadorDecrescente extends Ordenador {

	
	@Override
	public void executa(int[] valores) {
		Arrays.sort(valores);
		int[] aux=new int[valores.length];
		for(int i=0;i<valores.length;i++) {
			aux[(valores.length - 1 )-i]= valores[i];
		}
		valores=aux;
	}
}
