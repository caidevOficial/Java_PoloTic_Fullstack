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
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Logica.Controladora;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Front extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtResultado;

	public static void MensajeError() {
		//===================================================================
		JOptionPane alerta = new JOptionPane("Alguno de los campos esta vacío");
		alerta.setMessageType(JOptionPane.ERROR_MESSAGE);
		//por defecto tiene un solo boton y toma el idioma del sistema.
		JDialog dialogo = alerta.createDialog("Error");
		dialogo.setVisible(true);
		dialogo.setAlwaysOnTop(true);
		//===================================================================
	}
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("rawtypes")
	public Front() {
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 464);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(12, 0, 339, 402);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCalculadorappJava = new JLabel("CalculadorApp - [Java]");
		lblCalculadorappJava.setForeground(Color.RED);
		lblCalculadorappJava.setBounds(70, 12, 201, 26);
		lblCalculadorappJava.setFont(new Font("URW Bookman L", Font.BOLD | Font.ITALIC, 16));
		panel.add(lblCalculadorappJava);
		
		JComboBox comboBoxSign = new JComboBox();
		comboBoxSign.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
		comboBoxSign.setSelectedIndex(0);
		comboBoxSign.setFont(new Font("Dialog", Font.BOLD, 16));
		comboBoxSign.setForeground(Color.RED);
		comboBoxSign.setBackground(Color.DARK_GRAY);
		comboBoxSign.setBounds(146, 125, 56, 45);
		panel.add(comboBoxSign);
		
		txtNum1 = new JTextField();
		txtNum1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//para que no entren caracteres, solo numeros
				char car = e.getKeyChar();
				if(car < '0' || car > '9') {
					e.consume();
				}
			}
		});
		txtNum1.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNum1.setForeground(Color.RED);
		txtNum1.setBackground(Color.DARK_GRAY);
		txtNum1.setBounds(12, 125, 77, 45);
		panel.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//para que no entren caracteres, solo numeros
				char car = e.getKeyChar();
				if(car < '0' || car > '9') {
					e.consume();
				}
			}
		});
		txtNum2.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNum2.setForeground(Color.RED);
		txtNum2.setBackground(Color.DARK_GRAY);
		txtNum2.setColumns(10);
		txtNum2.setBounds(250, 125, 77, 45);
		panel.add(txtNum2);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtResultado.setForeground(Color.RED);
		txtResultado.setBackground(Color.DARK_GRAY);
		txtResultado.setText("Sudo apt-get Resultado");
		txtResultado.setColumns(10);
		txtResultado.setBounds(12, 50, 315, 45);
		panel.add(txtResultado);
		
		// Action of sum button
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(txtNum1.getText().equals("") || txtNum2.getText().equals("")) {
					MensajeError();
				}else {
					// parseo el string en double
					double num1 = Double.parseDouble(txtNum1.getText());
					double num2 = Double.parseDouble(txtNum2.getText());
					double suma = Controladora.Suma(num1, num2);
					// parseo a string
					txtResultado.setText(Double.toString(suma));					
				}
			}
		});
		
		btnSum.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSum.setBackground(Color.DARK_GRAY);
		btnSum.setForeground(Color.RED);
		btnSum.setBounds(12, 201, 50, 27);
		panel.add(btnSum);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(txtNum1.getText().equals("") || txtNum2.getText().equals("")) {
					MensajeError();
				}else {
					// parseo el string en double
					double num1 = Double.parseDouble(txtNum1.getText());
					double num2 = Double.parseDouble(txtNum2.getText());
					double resta = Controladora.Resta(num1, num2);
					// parseo a string
					txtResultado.setText(Double.toString(resta));
				}
			}
		});
		
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 16));
		btnMinus.setForeground(Color.RED);
		btnMinus.setBackground(Color.DARK_GRAY);
		btnMinus.setBounds(92, 201, 50, 27);
		panel.add(btnMinus);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(txtNum1.getText().equals("") || txtNum2.getText().equals("")) {
					MensajeError();
				}else {
					// parseo el string en double
					double num1 = Double.parseDouble(txtNum1.getText());
					double num2 = Double.parseDouble(txtNum2.getText());
					double mul = Controladora.Mul(num1, num2);
					// parseo a string
					txtResultado.setText(Double.toString(mul));
				}
			}
		});
		
		btnMul.setFont(new Font("Dialog", Font.BOLD, 16));
		btnMul.setBackground(Color.DARK_GRAY);
		btnMul.setForeground(Color.RED);
		btnMul.setBounds(196, 201, 50, 27);
		panel.add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(txtNum1.getText().equals("") || txtNum2.getText().equals("")) {
					MensajeError();
				}else {
					// parseo el string en double
					double num1 = Double.parseDouble(txtNum1.getText());
					double num2 = Double.parseDouble(txtNum2.getText());
					double div = Controladora.Div(num1, num2);
					// parseo a string
					txtResultado.setText(Double.toString(div));
				}
			}
		});
		
		btnDiv.setFont(new Font("Dialog", Font.BOLD, 16));
		btnDiv.setForeground(Color.RED);
		btnDiv.setBackground(Color.DARK_GRAY);
		btnDiv.setBounds(277, 201, 50, 27);
		panel.add(btnDiv);
	}
}
