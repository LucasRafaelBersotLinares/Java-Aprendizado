package Basico;

import java.awt.Color;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingBasico {
	public static void main(String[] args) {
		JFrame janela = new JFrame("Minha Primeira Janela");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(1280,720);
		
		JPanel painel = new JPanel();
		painel.setBackground(Color.gray);
		
		JLabel rotulo = new JLabel("Olá mundo: ", SwingConstants.CENTER);
		JButton b1 = new JButton("Botao 1");
		JButton b2 = new JButton("Botao 2");
		
		painel.add(rotulo);
		painel.add(b1);
		painel.add(b2);
		
		janela.add(painel);
		janela.setVisible(true);
		
		b1.addActionListener(e -> { 
			JOptionPane.showMessageDialog(null,"Botao 1: Clicado");
		});
		
		b2.addActionListener(e -> { 
			String nome= JOptionPane.showInputDialog(null, "Qual é o seu nome?","Cadastro" , JOptionPane.QUESTION_MESSAGE);
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja mostrar o nome?", "Pergunta", JOptionPane.YES_NO_OPTION);
			if(resposta==JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Nome "+nome, "Dados do Usuario", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
	}
}
