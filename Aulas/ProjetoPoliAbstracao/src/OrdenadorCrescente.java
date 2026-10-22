import java.util.Arrays;

public class OrdenadorCrescente extends Ordenador {

	@Override
	public void executa(int[] valores) {
		Arrays.sort(valores);
	}
}
