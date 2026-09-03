package br.LocalNestedClass;

public class Carteira {
	void processarPagamento() {
		class Transacao {
			void validar() {
				System.out.println("Transação Validada");
			}
		}
		
		Transacao tx= new Transacao();
		tx.validar();
	}
}
