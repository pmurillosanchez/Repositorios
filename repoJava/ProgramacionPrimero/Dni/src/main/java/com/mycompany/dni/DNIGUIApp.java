package com.mycompany.dni;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DNIGUIApp {

	private JFrame frame;
	private JTextField txtDNI;
	private JTextField txtLetra;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DNIGUIApp window = new DNIGUIApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DNIGUIApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DNI:");
		lblNewLabel.setBounds(70, 82, 31, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(141, 104, 1, 1);
		frame.getContentPane().add(layeredPane);
		
		txtDNI = new JTextField();
		txtDNI.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDNI.setBounds(102, 79, 96, 20);
		frame.getContentPane().add(txtDNI);
		txtDNI.setColumns(10);
		
		
		txtLetra = new JTextField();
		txtLetra.setEditable(false);
		txtLetra.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtLetra.setHorizontalAlignment(SwingConstants.CENTER);
		txtLetra.setBounds(212, 79, 25, 20);
		frame.getContentPane().add(txtLetra);
		txtLetra.setColumns(10);
		
		btnNewButton = new JButton("Letra");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dniTecleado = txtDNI.getText();
				
				if (DNIUtils.esDniValido(dniTecleado)) {				  
				  char letra = DNIUtils.obtenerLetraDNI(dniTecleado);
				  String strLetra = "" + letra;
				  txtLetra.setText(strLetra);
				}
				else {
					txtLetra.setText("");
					javax.swing.JOptionPane.showMessageDialog(
							frame, 
							"DNI no válido",
							"Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(102, 107, 96, 23);
		frame.getContentPane().add(btnNewButton);
	}
}

