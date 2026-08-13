package br.labirinto;

public class Principal {
	
	Menu menu=new Menu();
	
	public static void main(String[] args) {
		Sala s1 =new Sala("Sala 1");
		Sala s2 =new Sala("Sala 2");
		Sala s3 =new Sala("Sala 3");
		
		s1.setN(s2);
		s2.setS(s1);
		
		s1.setS(s3);
		s3.setN(s1);
	
		Navegador nav=new Navegador(s1);
		
		Menu menu=new Menu();
		int opcao=0;
		while(opcao!=5) {
			opcao=menu.mostrarMenu();
			if(opcao==1)
				nav.navN();
			else if(opcao==2)
				nav.navS();
			else if(opcao==3)
				nav.navL();
			else if(opcao==4)
				nav.navO();
		}
	}
	
}
