package GUI;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
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
		lblProgramitaBuscador.setBounds(145, 12, 208, 31);
		lblProgramitaBuscador.setText("Programita Buscador");
		lblProgramitaBuscador.setFont(new Font("URW Chancery L", Font.BOLD, 24));
		contentPane.add(lblProgramitaBuscador);
		
		JLabel lblIngreseUnNombre = new JLabel();
		lblIngreseUnNombre.setBounds(155, 43, 178, 17);
		lblIngreseUnNombre.setText("ingrese un nombre a cargar:");
		contentPane.add(lblIngreseUnNombre);
		
		txtCargar = new JTextField();
		txtCargar.setBounds(44, 72, 361, 49);
		contentPane.add(txtCargar);
		
		JButton btnAgregar = new JButton();
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombreAgregar = txtCargar.getText();
				control.CargarArray(nombreAgregar);
			}
		});
		
		btnAgregar.setBounds(180, 122, 83, 27);
		btnAgregar.setText("Agregar");
		contentPane.add(btnAgregar);
		
		JLabel lblNombreABuscar = new JLabel();
		lblNombreABuscar.setBounds(164, 161, 118, 17);
		lblNombreABuscar.setText("Nombre a buscar:");
		contentPane.add(lblNombreABuscar);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(44, 180, 361, 56);
		contentPane.add(txtBuscar);
		
		JButton btnBuscar = new JButton();
		btnBuscar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String nombre = txtBuscar.getText();
				Boolean resultado = control.BuscaryMostrarNombre(nombre);
				if(resultado) {
					txtResultado.setText("Encontre el texto.");
				}else {
					txtResultado.setText("No encontre el texto.");
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
