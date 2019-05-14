package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ABB.ABB;

import Vista.panelABB;

public class controladorABB implements ActionListener{

	ABB arbol = new ABB();
	panelABB panelabb;
	
	
	public controladorABB(panelABB panelabb) {
		this.panelabb = panelabb;
		
		this.panelabb.botonInsertar.addActionListener(this);
		this.panelabb.botonEliminar.addActionListener(this);
		this.panelabb.botonBuscar.addActionListener(this);
		this.panelabb.botonEstadoActual.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelabb.botonInsertar) {
			arbol.Insertar(Integer.parseInt(panelabb.fieldInsertar.getText()));	
			this.panelabb.textArea.setText("");
		}
		if(e.getSource() == panelabb.botonEliminar) {
			arbol.EliminarNodo(Integer.parseInt(panelabb.fieldEliminar.getText()));
			this.panelabb.textArea.setText("");
		}
		if(e.getSource() == panelabb.botonBuscar) {
			
			if(arbol.Buscar(arbol.nodoraiz, Integer.parseInt(panelabb.fieldBuscar.getText()))==null) {
				JOptionPane.showMessageDialog(null, "El valor Buscado no se encuentra",null,JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Valor Encontrado",null,JOptionPane.INFORMATION_MESSAGE);
			}
				
			this.panelabb.textArea.setText("");
		}
		if(e.getSource() == panelabb.botonEstadoActual) {
			arbol.obtenerArbol(arbol.nodoraiz);
			if(arbol.nodoraiz !=null) {
				this.panelabb.textArea.setText("Arbol de Busqueda Binaria\n"
						+ "Altura : " + arbol.getAlturaArbol(arbol.nodoraiz) +"\n"
						+ "N° de nodos : " +arbol.getNnodos(arbol.nodoraiz)+"\n"
						+ "N° de Elementos : " + arbol.getNnodos(arbol.nodoraiz)+"\n"
						+ "Elementos : "+arbol.vectorarbol);
				arbol.vectorarbol.clear();
				
			}if(arbol.nodoraiz == null) {
				JOptionPane.showMessageDialog(null, "El arbol no se ha inicializado",null,JOptionPane.WARNING_MESSAGE);
			}
			
		}
	}
}
