package br.ifsp.Agregacao;

public class Principal {

	public static void main(String[] args) {
		Jogador jogador1=new Jogador();
		Jogador jogador2=new Jogador();
		
		jogador1.setNome("José");
		jogador2.setNome("Ricardo");
		
		Time time= new Time();
		time.setNome("Los Loucos");
		
		time.addJogador(jogador1);
		time.addJogador(jogador2);
		
		System.out.println(time.getJogadores());
	}

}
