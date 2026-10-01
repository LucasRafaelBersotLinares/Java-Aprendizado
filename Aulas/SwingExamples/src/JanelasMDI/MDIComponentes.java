package JanelasMDI;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MDIComponentes extends JInternalFrame {
	
	
	
	public MDIComponentes(String titulo) {
		super(titulo, true, true, true, true);
		setSize(200,200);
		setLayout(new BorderLayout());
		
		JPanel painel=new JPanel();
		
		MouseAdapter ma= new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {
				System.out.println("Mouse Entered.");
			}
			
		};
		
		MouseAdapter ma2= new MouseAdapter() {
			public void MouseMoved(MouseEvent event) {
				System.out.println("X: "+event.getX()+"Y:"+event.getY());			
			}
			
		};
		
		painel.addMouseListener(ma);
		painel.addMouseMotionListener(ma2);
		
		add(painel, BorderLayout.CENTER);
	}
	
	
	
}
