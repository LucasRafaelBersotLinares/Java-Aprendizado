package br.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<String> textos=new ArrayList();
		
		System.out.println(textos.size());
		
		for(int i =0; i<10;i++) { textos.add("Ola Loucos:" + i);}
		
		for(String s:textos) {
			System.out.println(s);
		}
		
		for(int i=0; i<textos.size();i++) {
			System.out.println(textos.get(i));
		}
		
		List<String> subLista=textos.subList(0, 3);
		
		//==
		List<Integer> listaLigada=new LinkedList();
		listaLigada.add(2);
		listaLigada.remove(0);
		//Isso representa uma lista encadeada

	}

}
