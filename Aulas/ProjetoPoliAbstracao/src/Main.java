
public class Main {

	public static void main(String[] args) {
		OrdenadorCrescente oc = new OrdenadorCrescente();
		OrdenadorDecrescente od = new OrdenadorDecrescente();
		
		SistemaDeOrdenacao so= new SistemaDeOrdenacao();
		
		int[] val= {5,2,3,7,6};
		
		so.injetaOrdenador(oc);
		so.executa(val);
		so.injetaOrdenador(od);
		so.executa(val);

	}

}
