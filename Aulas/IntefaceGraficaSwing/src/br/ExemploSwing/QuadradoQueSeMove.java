package br.ExemploSwing;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame; //Importação direta da biblioteca;
import javax.swing.JPanel;

public class QuadradoQueSeMove extends JPanel implements KeyListener{
	private int x,y;
	
	
	public QuadradoQueSeMove() {
		setBackground(Color.BLACK);
		setFocusable(true); // Permite que o panel receba Foco (' Quer dizer se vc clicar nele ele vai pegar a digitacao do teclado e nao ira pro google por exemplo ');
		addKeyListener(this);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Quadrado Que se Move");
		frame.add(new QuadradoQueSeMove());
		frame.setSize(640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		int tecla = e.getKeyCode();
		
		if(tecla==KeyEvent.VK_UP) {
			y-=10;
		}
		if(tecla==KeyEvent.VK_DOWN) {
			y+=10;
		}
		if(tecla==KeyEvent.VK_LEFT) {
			x-=10;
		}
		if(tecla==KeyEvent.VK_RIGHT) {
			x+=10;
		}
		
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.gray);
		g.fillRect(x,y,50,20);
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {}
	
	
}
