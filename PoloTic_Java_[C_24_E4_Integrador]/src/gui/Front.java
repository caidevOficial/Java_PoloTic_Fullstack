/*
 * Copyright (C) 2020 FacuFalcone - CaidevOficial
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

package gui;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import logic.Controller;
import java.awt.Color;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Front extends JFrame {

    private JPanel contentPane;
    Controller control = new Controller();
    private JTextField textField_showCourses;
    public static void ErrorMessage(String tituloPane, String errorMsg) {
		//===================================================================
		JOptionPane alerta = new JOptionPane(errorMsg);
		alerta.setMessageType(JOptionPane.ERROR_MESSAGE);
		//por defecto tiene un solo boton y toma el idioma del sistema.
		JDialog dialogo = alerta.createDialog(tituloPane);
		dialogo.setVisible(true);
		dialogo.setAlwaysOnTop(true);
		//===================================================================
	}
    
    public static void SuccessMessage(String tituloPane, String errorMsg) {
		//===================================================================
		JOptionPane alerta = new JOptionPane(errorMsg);
		alerta.setMessageType(JOptionPane.CLOSED_OPTION);
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
    	setResizable(false);
    	setTitle("Course Loader");
    	setBackground(Color.DARK_GRAY);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setBounds(100, 100, 899, 460);
	   contentPane = new JPanel();
	   contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	   contentPane.setLayout(new BorderLayout(0, 0));
	   setContentPane(contentPane);
	   
	   JPanel panel = new JPanel();
	   panel.setBackground(Color.DARK_GRAY);
	   contentPane.add(panel, BorderLayout.CENTER);
	   panel.setLayout(null);
	   
	   JPanel panel_1 = new JPanel();
	   panel_1.setBackground(Color.DARK_GRAY);
	   panel_1.setBounds(435, 7, 434, 393);
	   panel.add(panel_1);
	   panel_1.setLayout(null);
	   
	   TextField Campo_idCurso = new TextField();
	   Campo_idCurso.setBounds(250, 34, 70, 19);
	   panel_1.add(Campo_idCurso);
	   
	   TextField Campo_nombreCurso = new TextField();
	   Campo_nombreCurso.setBounds(239, 59, 93, 25);
	   panel_1.add(Campo_nombreCurso);
	   
	   TextField Campo_horasCurso = new TextField();
	   Campo_horasCurso.setBounds(250, 103, 77, 19);
	   panel_1.add(Campo_horasCurso);
	   
	   JCheckBox Campo_certifCurso = new JCheckBox("");
	   Campo_certifCurso.setBounds(282, 138, 21, 23);
	   panel_1.add(Campo_certifCurso);
	   
	   JLabel lblCertific = new JLabel("Con Certificado:");
	   lblCertific.setBounds(117, 138, 133, 23);
	   panel_1.add(lblCertific);
	   lblCertific.setForeground(Color.WHITE);
	   
	   JLabel lblCargarCurso = new JLabel("Cargar Curso");
	   lblCargarCurso.setBounds(177, 7, 93, 15);
	   panel_1.add(lblCargarCurso);
	   lblCargarCurso.setForeground(Color.WHITE);
	   
	   JLabel lblIdCurso = new JLabel("ID Curso:");
	   lblIdCurso.setBounds(123, 34, 64, 15);
	   panel_1.add(lblIdCurso);
	   lblIdCurso.setForeground(Color.WHITE);
	   
	   JLabel lblNombreCurso = new JLabel("Nombre Curso:");
	   lblNombreCurso.setBounds(117, 65, 105, 19);
	   panel_1.add(lblNombreCurso);
	   lblNombreCurso.setForeground(Color.WHITE);
	   
	   JLabel lblHorasCurso = new JLabel("Horas Curso:");
	   lblHorasCurso.setBounds(117, 103, 112, 23);
	   panel_1.add(lblHorasCurso);
	   lblHorasCurso.setForeground(Color.WHITE);
	   
	   JButton btnAgregar = new JButton("Cargar Curso");
	   btnAgregar.setBounds(155, 173, 127, 25);
	   panel_1.add(btnAgregar);
	   
	   textField_showCourses = new JTextField();
	   textField_showCourses.setBounds(12, 226, 410, 103);
	   panel_1.add(textField_showCourses);
	   textField_showCourses.setColumns(10);
	   
	   JButton btnShowCourses = new JButton("Ver Cursos");
	   btnShowCourses.addActionListener(new ActionListener() {
	   	public void actionPerformed(ActionEvent arg0) {
	   	 textField_showCourses.setText(control.PrintCourses());
	   	}
	   });
	   btnShowCourses.setBounds(165, 341, 117, 25);
	   panel_1.add(btnShowCourses);
	   btnAgregar.addActionListener(new ActionListener() {
	   	
		  public void actionPerformed(ActionEvent arg0) {
        	   	 if(Campo_idCurso.getText().equals("") ||
        	   		Campo_nombreCurso.getText().equals("") || 
        	   		Campo_horasCurso.getText().equals("")) {
        			ErrorMessage("Error","Hay al menos un campo vacio.");
        		}else {
        		    Controller.addCourseLL(Campo_idCurso.getText(), Campo_horasCurso.getText(), Campo_nombreCurso.getText(), Campo_certifCurso.isSelected());
        		    SuccessMessage("Exito!", "Curso cargado con exito!");
        		}
	   	}
	   });
	   
	   
	   
	   JPanel panel_2 = new JPanel();
	   panel_2.setBackground(Color.DARK_GRAY);
	   panel_2.setBounds(12, 7, 408, 398);
	   panel.add(panel_2);
    }
}
