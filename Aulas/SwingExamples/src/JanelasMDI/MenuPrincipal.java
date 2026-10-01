package JanelasMDI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;

public class MenuPrincipal extends JFrame{
	private JDesktopPane desktopPane;
	
	public MenuPrincipal() {
		setTitle("Janela Foda só que V1 entedeu Bruno Safado? HAHAHAHHA");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		desktopPane= new JDesktopPane();
		add(desktopPane, BorderLayout.CENTER);
		
		JMenuBar menuBar= new JMenuBar();
		JMenu menuModulos= new JMenu("Módulos");
		JMenuItem menuItem= new JMenuItem("Abrir Janela");
		JMenuItem menuItem2= new JMenuItem("Abrir Janela Componentes");
		
		menuItem.addActionListener(e -> {
			JanelaMDI janela= new JanelaMDI("Janelinha kskskskks");
			janela.setVisible(true);
			desktopPane.add(janela);
			
		});
		
		menuItem2.addActionListener(e -> {
			MDIComponentes janela= new MDIComponentes("Janela de Componentes MDI");
			janela.setVisible(true);
			desktopPane.add(janela);
		});
		
		menuModulos.add(menuItem);
		menuModulos.add(menuItem2);
		
		menuBar.add(menuModulos);
		setJMenuBar(menuBar);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			MenuPrincipal mp = new MenuPrincipal();
			mp.setVisible(true);
		});

	}

}
