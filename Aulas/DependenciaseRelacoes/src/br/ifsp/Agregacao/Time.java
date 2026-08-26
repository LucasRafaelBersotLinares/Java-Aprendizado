package br.ifsp.Agregacao;

import java.util.List;
import java.util.ArrayList;

public class Time {
	private String name;
	
	List<Jogador> jogadores=new ArrayList<>();
	
	public void addJogador(Jogador jogador) {
		jogadores.add(jogador);
	}

	public String getJogadores() {
		String relatorio="";
		
		for(Jogador jogador:jogadores) {
			relatorio+=""+jogador.getNome()+"\n";
		}
		return relatorio;
		
	}
	
	public String getNome() {
		return name;
	}
	
	public void setNome(String name) {
		this.name=name;
	}

}
