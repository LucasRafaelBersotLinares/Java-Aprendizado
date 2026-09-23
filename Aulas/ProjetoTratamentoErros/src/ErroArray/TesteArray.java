package ErroArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TesteArray {

	public static void main(String[] args) {
		String[] frutas = {"Maçã","Mamão","Uva"};
		try {
			System.out.println("Fruta: "+ frutas[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("Erro: " + e);
		}
		finally { 
			System.out.println("Após o erro");
		}
		
		String nome = null;
		
		try {
			if(nome.equals("Joao")) {
				System.out.println(nome);
			}
		}
		catch(NullPointerException e) {
			System.out.println("Nome null: " + e);
			nome = "Joao";
		}
		finally {
			if(nome.equals("Joao")) {
				System.out.println("Bem vindo Joao");
			}
		}
		//Usando IO
		String[] nomes= {"Jose","Joao","Joaquim"};
		BufferedWriter writer=null;
		try {
			writer = new BufferedWriter(new FileWriter("arquivo.txt"));
			for(String n:nomes) {
				writer.write(n);
				writer.newLine();
			}
		}
		catch(Exception e){
			System.out.println("Erro: "+e);
		}
		finally{
			try {
				writer.close();
				System.out.println("Arquivo fechado");
			}
			catch(Exception e) {
				System.out.println("Erro Fechando arquivo: " + e);
			}
		}
		
		System.out.println("Lendo o arquivo");
		
		//try {
		//	reader=new BufferedReader(new FileReader("arquivo.txt"));
		//	String linha="";
		//	while((linha=reader.readLine())!=null) {
		//		System.out.println(linha);
		//	}
		//	//while((linha=reader.readLine())!=null)
		//}
		//catch(IOException e) {
		//	
		//}
		
		try {
			testeErro("ar.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void testeErro(String na) throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader(na));
		String linha="";
		while((linha= reader.readLine())!=null) {
			System.out.println(linha);
		}
	}
}
