package unidad_12;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Actividad_12_2_ParqueAutomovilistico {

	private JFrame frmParqueAutomovilistico;

	private JLabel lblMatricula;
	private JLabel lblNombrePropietario;
	private JLabel lblNombreBastidor;
	private JLabel lblImpuestoCirculacion;
	private JLabel lblImpuestoPagado;
	private JTextField textFieldMatricula;
	private JTextField textFieldNombrePropietario;
	private JTextField textFieldNumeroBastidor;
	private JTextField textFieldImpuestoCirculacion;
	private JComboBox comboBoxImpuestoPagado;
	private JButton btnAceptar;
	private JButton btnLimpiar;

	private JLabel lblMatriculaBuscar;
	private JTextField textFieldMatriculaBuscar;
	private JTextArea textArea;
	private JButton btnAceptarBuscar;
	private JButton btnLimpiarBuscar;

	private JLabel lblTotalRecaudado;
	private JLabel lblTotalRecaudadoResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad_12_2_ParqueAutomovilistico window = new Actividad_12_2_ParqueAutomovilistico();
					window.frmParqueAutomovilistico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Actividad_12_2_ParqueAutomovilistico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmParqueAutomovilistico = new JFrame();
		frmParqueAutomovilistico
				.setTitle("Parque Automov\u00EDstico Alcal\u00E1 de Henares");
		frmParqueAutomovilistico.setBounds(100, 100, 418, 333);
		frmParqueAutomovilistico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/*
		 * Pantalla Inicial
		 */

		JMenuBar menuBar = new JMenuBar();
		frmParqueAutomovilistico.setJMenuBar(menuBar);

		JMenu mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);

		JMenuItem mntmNuevoVehiculo = new JMenuItem("Nuevo vehiculo");
		mnOperaciones.add(mntmNuevoVehiculo);
		mntmNuevoVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMatricula.setBounds(15, 20, 89, 29);
				lblNombrePropietario.setBounds(15, 50, 161, 29);
				lblNombreBastidor.setBounds(15, 80, 176, 29);
				lblImpuestoCirculacion.setBounds(15, 110, 217, 29);
				lblImpuestoPagado.setBounds(15, 140, 192, 29);
				textFieldMatricula.setBounds(216, 25, 176, 20);
				textFieldNombrePropietario.setBounds(216, 55, 176, 20);
				textFieldNumeroBastidor.setBounds(216, 85, 176, 20);
				textFieldImpuestoCirculacion.setBounds(216, 115, 176, 20);
				comboBoxImpuestoPagado.setBounds(216, 150, 110, 22);
				btnAceptar.setBounds(15, 238, 89, 23);
				btnLimpiar.setBounds(154, 238, 89, 23);
			}
		});

		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mnOperaciones.add(mntmBuscar);
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMatriculaBuscar.setBounds(15, 20, 89, 29);
				textFieldMatriculaBuscar.setBounds(216, 25, 176, 20);
				textArea.setBounds(10, 99, 382, 130);
				btnAceptarBuscar.setBounds(15, 238, 89, 23);
				btnLimpiarBuscar.setBounds(154, 238, 89, 23);

			}
		});

		JMenuItem mntmCalcularComputo = new JMenuItem(
				"Calcular computo recaudado");
		mnOperaciones.add(mntmCalcularComputo);
		mntmCalcularComputo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTotalRecaudado.setBounds(15, 140, 192, 29);
				lblTotalRecaudadoResultado.setBounds(216, 140, 192, 29);
				int resultadoTotalRecaudado = 0;
				try {
					Connection Conexion = DriverManager.getConnection(
							"jdbc:mysql://localhost/ParqueAutomovilistico",
							"root", "");
					Statement SentenciaSQL = Conexion.createStatement();
					ResultSet registroImpuestoMatriculacion = SentenciaSQL
							.executeQuery("SELECT * FROM datos_vehiculo");
					while (registroImpuestoMatriculacion.next()) {
						resultadoTotalRecaudado += registroImpuestoMatriculacion
								.getInt("impuesto_circulacion");
					}
					SentenciaSQL.close();
					Conexion.close();

				} catch (SQLException error) {
					System.out.println(error);
				}
				lblTotalRecaudadoResultado
						.setText(resultadoTotalRecaudado + " €");

			}
		});

		frmParqueAutomovilistico.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(288, 238, 89, 23);
		frmParqueAutomovilistico.getContentPane().add(btnNewButton);

		/*
		 * Pantalla Insertar vehiculo
		 */

		lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmParqueAutomovilistico.getContentPane().add(lblMatricula);

		lblNombrePropietario = new JLabel("Nombre propietario");
		lblNombrePropietario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmParqueAutomovilistico.getContentPane().add(lblNombrePropietario);

		lblNombreBastidor = new JLabel("Numero bastidor");
		lblNombreBastidor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmParqueAutomovilistico.getContentPane().add(lblNombreBastidor);

		lblImpuestoCirculacion = new JLabel("Impuesto circulacion");
		lblImpuestoCirculacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmParqueAutomovilistico.getContentPane().add(lblImpuestoCirculacion);

		lblImpuestoPagado = new JLabel("Impuesto circulacion pagado");
		lblImpuestoPagado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmParqueAutomovilistico.getContentPane().add(lblImpuestoPagado);

		textFieldMatricula = new JTextField();
		textFieldMatricula.setColumns(10);
		frmParqueAutomovilistico.getContentPane().add(textFieldMatricula);

		textFieldNombrePropietario = new JTextField();
		textFieldNombrePropietario.setColumns(10);
		frmParqueAutomovilistico.getContentPane()
				.add(textFieldNombrePropietario);

		textFieldNumeroBastidor = new JTextField();
		textFieldNumeroBastidor.setColumns(10);
		frmParqueAutomovilistico.getContentPane().add(textFieldNumeroBastidor);

		textFieldImpuestoCirculacion = new JTextField();
		textFieldImpuestoCirculacion.setColumns(10);
		frmParqueAutomovilistico.getContentPane()
				.add(textFieldImpuestoCirculacion);

		comboBoxImpuestoPagado = new JComboBox();
		comboBoxImpuestoPagado.setMaximumRowCount(2);
		comboBoxImpuestoPagado.setModel(
				new DefaultComboBoxModel(new String[]{"Pagado", "No pagado"}));
		frmParqueAutomovilistico.getContentPane().add(comboBoxImpuestoPagado);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int impuestoCiculacionPagado;

				if ((String) comboBoxImpuestoPagado
						.getSelectedItem() == "Pagado") {
					impuestoCiculacionPagado = 1;
				} else {
					impuestoCiculacionPagado = 0;
				}

				try {

					Connection Conexion = DriverManager.getConnection(
							"jdbc:mysql://localhost/ParqueAutomovilistico",
							"root", "");
					Statement SentenciaSQL = Conexion.createStatement();
					SentenciaSQL.execute("INSERT INTO datos_vehiculo VALUES ('"
							+ textFieldMatricula.getText() + "', '"
							+ textFieldNombrePropietario.getText() + "', '"
							+ textFieldNumeroBastidor.getText() + "', "
							+ textFieldImpuestoCirculacion.getText() + ", "
							+ impuestoCiculacionPagado + ");");

					SentenciaSQL.close();
					Conexion.close();

				} catch (SQLException error) {
					System.out.println(error);
				}

				lblMatricula.setBounds(0, 0, 0, 0);
				lblNombrePropietario.setBounds(0, 0, 0, 0);
				lblNombreBastidor.setBounds(0, 0, 0, 0);
				lblImpuestoCirculacion.setBounds(0, 0, 0, 0);
				lblImpuestoPagado.setBounds(0, 0, 0, 0);
				textFieldMatricula.setBounds(0, 0, 0, 0);
				textFieldNombrePropietario.setBounds(0, 0, 0, 0);
				textFieldNumeroBastidor.setBounds(0, 0, 0, 0);
				textFieldImpuestoCirculacion.setBounds(0, 0, 0, 0);
				comboBoxImpuestoPagado.setBounds(0, 0, 0, 0);
				btnAceptar.setBounds(0, 0, 0, 0);
				btnLimpiar.setBounds(0, 0, 0, 0);

			}
		});
		frmParqueAutomovilistico.getContentPane().add(btnAceptar);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldMatricula.setText("");
				textFieldNombrePropietario.setText("");
				textFieldNumeroBastidor.setText("");
				textFieldImpuestoCirculacion.setText("");
			}
		});
		frmParqueAutomovilistico.getContentPane().add(btnLimpiar);

		/*
		 * Pantalla Buscar Vehiculo
		 */

		lblMatriculaBuscar = new JLabel("Matricula");
		lblMatriculaBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmParqueAutomovilistico.getContentPane().add(lblMatriculaBuscar);

		textFieldMatriculaBuscar = new JTextField();
		textFieldMatriculaBuscar.setColumns(10);
		frmParqueAutomovilistico.getContentPane().add(textFieldMatriculaBuscar);

		textArea = new JTextArea();
		textArea.setEnabled(false);
		frmParqueAutomovilistico.getContentPane().add(textArea);

		btnAceptarBuscar = new JButton("Aceptar");
		btnAceptarBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String matricula = textFieldMatriculaBuscar.getText();
				try {
					Connection Conexion = DriverManager.getConnection(
							"jdbc:mysql://localhost/ParqueAutomovilistico",
							"root", "");

					Statement SentenciaSQL = Conexion.createStatement();
					ResultSet registro = SentenciaSQL.executeQuery(
							"SELECT * FROM datos_vehiculo WHERE matricula = '"
									+ matricula + "'");
					System.out.println(registro);
					while (registro.next()) {
						textArea.setText("Matricula: "
								+ registro.getString("matricula") + "\n"
								+ "Nombre Propietario: "
								+ registro.getString("nombre_propietario")
								+ "\n" + "Numero Bastidos: "
								+ registro.getString("numero_bastidor") + "\n"
								+ "Impuesto Circulacion: "
								+ registro.getInt("impuesto_circulacion") + "\n"
								+ "Impuesto Circculacion Pagado (1 = Si; 0 = No): "
								+ registro.getInt("impuesto_circulacion_pagado")
								+ "\n");

					}
					SentenciaSQL.close();
					Conexion.close();

				} catch (SQLException error) {
					System.out.println(error);
				}
			}
		});
		frmParqueAutomovilistico.getContentPane().add(btnAceptarBuscar);

		btnLimpiarBuscar = new JButton("Limpiar");
		btnLimpiarBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldMatriculaBuscar.setText("");
				textArea.setText("");
			}
		});
		frmParqueAutomovilistico.getContentPane().add(btnLimpiarBuscar);

		/*
		 * Pantalla Calcular computo
		 */

		lblTotalRecaudado = new JLabel("Total recaudado");
		lblTotalRecaudado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmParqueAutomovilistico.getContentPane().add(lblTotalRecaudado);

		lblTotalRecaudadoResultado = new JLabel("");
		lblTotalRecaudadoResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmParqueAutomovilistico.getContentPane()
				.add(lblTotalRecaudadoResultado);

	}
}
