package Layouts;

import java.awt.*;
import javax.swing.*;

public class EstudoLayout {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("Estudo de Layouts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280,720);
		
		//configura o layout
		frame.setLayout(new BorderLayout());
		//BorderLayout Possuí: CENTER NORTH SOUTH EAST WESTE
		
		JPanel painelCentral= new JPanel();
		painelCentral.setBackground(Color.GRAY);
		
		JPanel painelNorte= new JPanel();
		painelNorte.setBackground(Color.BLACK);
		
		JPanel painelSul= new JPanel();
		painelSul.setBackground(Color.WHITE);
		
		JPanel painelLeste= new JPanel();
		painelLeste.setBackground(Color.LIGHT_GRAY);
		
		JPanel painelOeste= new JPanel();
		painelOeste.setBackground(Color.DARK_GRAY);
		
		painelOeste.setPreferredSize(new Dimension(90, 0));
		painelLeste.setPreferredSize(new Dimension(90, 0));
		painelSul.setPreferredSize(new Dimension(0, 50));
		
		painelCentral.setLayout(new GridLayout(2,2));
		JPanel L1C1 = new JPanel();
		JPanel L1C2 = new JPanel();
		JPanel L2C1 = new JPanel();
		JPanel L2C2 = new JPanel();
		
		Color cor1 = new Color(229, 171, 55);
		Color cor2 = new Color(0, 71, 171);
		Color cor3 = new Color(4, 115, 74);
		Color cor4 = new Color(204, 91, 51);
		
		L1C1.setBackground(cor1);
		L1C2.setBackground(cor2);
		L2C1.setBackground(cor3);
		L2C2.setBackground(cor4);
		
		painelCentral.add(L1C1);
		painelCentral.add(L1C2);
		painelCentral.add(L2C1);
		//painelCentral.add(L2C2);
		
		painelOeste.setLayout(new GridLayout(5,1));
		JButton b1 = new JButton("Botão 1");
		JButton b2 = new JButton("Botão 2");
		JButton b3 = new JButton("Botão 3");
		JButton b4 = new JButton("Botão 4");
		JButton b5 = new JButton("Botão 5");
		
		painelOeste.add(b1);
		painelOeste.add(b2);
		painelOeste.add(b3);
		painelOeste.add(b4);
		painelOeste.add(b5);
		
		JPanel conteudoJSP = new JPanel();
		conteudoJSP.setLayout(new GridLayout(200,1));
		for(int i=0; i<200;i++) {
			JButton botaoaux= new JButton("Botao "+i);
			botaoaux.addActionListener(e -> {
				JOptionPane.showMessageDialog(null, "Botao clicado");
				JFrame janela = new JFrame();
				janela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				janela.setSize(1280,720);
				janela.setLocationRelativeTo(null);
				janela.setVisible(true);
			});
			conteudoJSP.add(botaoaux);
		}
		
		JScrollPane scrollPane = new JScrollPane(conteudoJSP);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		painelCentral.add(scrollPane);
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(EstudoLayout.class.getResource("icon.png")));
		frame.add(painelCentral, BorderLayout.CENTER);
		frame.add(painelNorte, BorderLayout.NORTH);
		frame.add(painelSul, BorderLayout.SOUTH);
		frame.add(painelLeste, BorderLayout.EAST);
		frame.add(painelOeste, BorderLayout.WEST);
		
		//Centraliza
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}
