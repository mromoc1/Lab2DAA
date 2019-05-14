package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import Controlador.controladorABB;

public class Crud extends JFrame {
	private Font f = new Font("Century Gothic", Font.PLAIN, 12);
	
	JPanel panelABB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crud frame = new Crud();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Crud() {
		setTitle("");
		setSize(701, 250);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().add(panelCentral(), BorderLayout.CENTER);
		
	}
	
	public JTabbedPane panelCentral() {
		JTabbedPane panel = new JTabbedPane();
		panel.setFont(f);
		
		panel.addTab("ABB", null, panelABB(), null);
		
		panel.addTab("AVL", null, panelAVL(), null);
		
		panel.addTab("B-tree", null, panelB(), null);
		
		return panel;
	}
	
	public JPanel panelABB() {
		panelABB panel = new panelABB();
		controladorABB controlador = new controladorABB(panel);
		
		return panel;
	}
	
	public JPanel panelAVL() {
		panelAVL panel = new panelAVL();
		
		return panel;
	}
	
	public JPanel panelB() {
		panelB panel = new panelB();
		
		return panel;
		
	}
	

}
