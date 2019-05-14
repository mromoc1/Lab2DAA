package Controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Vista.Crud;

public class controladorCrud{

	Crud ventanacrud;
	
	public controladorCrud(Crud ventanacrud) {
		this.ventanacrud = ventanacrud;
	}

	public void iniciarVentana() {
	
		ventanacrud.setTitle("Opciones de Administrador");
		ventanacrud.setSize(900, 630);
		ventanacrud.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanacrud.setLocationRelativeTo(null);
		ventanacrud.setVisible(true);
		
	}
}
