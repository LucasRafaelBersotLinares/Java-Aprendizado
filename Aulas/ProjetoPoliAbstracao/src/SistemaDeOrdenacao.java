
public class SistemaDeOrdenacao {
	
	Ordenador ordena;
	
	public void injetaOrdenador(Ordenador ordenador) {
		this.ordena=ordena;
	}

	public void executa(int[] valores) {
		ordena.executa(valores);
		imprime(valores);
	}
	public void imprime(int[] valores) {
		for(int i=0;i<valores.length;i++) {
			System.out.println(valores[i]);
		}
	}
}
