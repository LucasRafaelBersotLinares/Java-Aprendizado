package ThreadSimples;

public class ProcessadorFrutas implements Runnable {
	public String nomeFruta;
	
	public ProcessadorFrutas(String nomeFruta) {
		this.nomeFruta=nomeFruta;
	}
	
	@Override 
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Processando..."+nomeFruta+" "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Linha de Produção "+nomeFruta+" interrompido");
			}
		}
		System.out.println("Fim do Processamento de "+nomeFruta);
	}
	
}
