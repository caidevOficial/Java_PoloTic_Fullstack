/*
 * Copyright (C) 2020 caidev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Logica.Controladora;
@SuppressWarnings("serial")
public class Front extends JFrame {

	private JPanel contentPane;
	private JTextField txtCargar;
	private JTextField txtBuscar;
	private JTextField txtResultado;
	Controladora control = new Controladora();

	public static void MensajeError(String tituloPane, String errorMsg) {
		//===================================================================
		JOptionPane alerta = new JOptionPane(errorMsg);
		alerta.setMessageType(JOptionPane.ERROR_MESSAGE);
		//por defecto tiene un solo boton y toma el idioma del sistema.
		JDialog dialogo = alerta.createDialog(tituloPane);
		dialogo.setVisible(true);
		dialogo.setAlwaysOnTop(true);
		//===================================================================
	}
	
	/**
	 * Create the frame.
	 */
	public Front() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProgramitaBuscador = new JLabel();
		lblProgramitaBuscador.setBounds(148, 0, 144, 31);
		lblProgramitaBuscador.setText("#BuscadorApp");
		lblProgramitaBuscador.setFont(new Font("URW Chancery L", Font.BOLD, 24));
		contentPane.add(lblProgramitaBuscador);
		
		JLabel lblIngreseUnNombre = new JLabel();
		lblIngreseUnNombre.setBounds(146, 43, 178, 17);
		lblIngreseUnNombre.setText("ingrese un nombre a cargar:");
		contentPane.add(lblIngreseUnNombre);
		
		txtCargar = new JTextField();
		txtCargar.setBounds(44, 72, 361, 49);
		contentPane.add(txtCargar);
		
		JButton btnAgregar = new JButton();
		btnAgregar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(txtCargar.getText().equals("")) {
					MensajeError("Error","El campo a cargar esta vacío.");
				}else {
					String nombreAgregar = txtCargar.getText();
					control.CargarArray(nombreAgregar);
				}
			}
		});
		
		btnAgregar.setBounds(180, 122, 83, 27);
		btnAgregar.setText("Agregar");
		contentPane.add(btnAgregar);
		
		JLabel lblNombreABuscar = new JLabel();
		lblNombreABuscar.setBounds(162, 161, 118, 17);
		lblNombreABuscar.setText("Nombre a buscar:");
		contentPane.add(lblNombreABuscar);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(44, 180, 361, 56);
		contentPane.add(txtBuscar);
		
		JButton btnBuscar = new JButton();
		btnBuscar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(txtCargar.getText().equals("")) {
					MensajeError("Error","El campo a buscar esta vacío.");
				}else {
					String nombre = txtBuscar.getText();
					Boolean resultado = control.BuscaryMostrarNombre(nombre);
					if(resultado) {
						txtResultado.setText("La palabra esta cargada.");
					}else {
						txtResultado.setText("La palabra NO esta cargada.");
					}
				}
			}
		});
		
		btnBuscar.setBounds(182, 238, 81, 27);
		btnBuscar.setText("Buscar");
		contentPane.add(btnBuscar);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(44, 277, 361, 56);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
	}
}
