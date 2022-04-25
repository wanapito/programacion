package unidad_11;

import java.io.*;

import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Actividad_11_2_MenuGestionFicheros {

	private JFrame frmLeerguardarFichero;
	private JTextArea textArea;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmCrearArchivo;
	private JMenuItem mntmAbrirArchivo;
	private JMenuItem mntmGuardarArchivo;
	private JMenuItem mntmSalir;
	private FileDialog cuadroDialogo;
	private JButton btnGrabar;
	
	// Crear Fichero
	private String ruta;
	private FileWriter flujoSalida;
	
	// Abrir fichero
	private BufferedReader flujoBr;
	File fichero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad_11_2_MenuGestionFicheros window = new Actividad_11_2_MenuGestionFicheros();
					window.frmLeerguardarFichero.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Actividad_11_2_MenuGestionFicheros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLeerguardarFichero = new JFrame();
		frmLeerguardarFichero.setTitle("Leer/Guardar fichero");
		frmLeerguardarFichero.setBounds(100, 100, 431, 501);
		frmLeerguardarFichero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLeerguardarFichero.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setBounds(32, 11, 342, 237);
		frmLeerguardarFichero.getContentPane().add(textArea);
		
		menuBar = new JMenuBar();
		frmLeerguardarFichero.setJMenuBar(menuBar);
	
		
		mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu);
		
		mntmCrearArchivo = new JMenuItem("Crear archivo");
		mnNewMenu.add(mntmCrearArchivo);
		mntmCrearArchivo.addActionListener(new ManejadorBotones());
		
		btnGrabar = new JButton("Grabar");
		frmLeerguardarFichero.getContentPane().add(btnGrabar);
		btnGrabar.addActionListener(new ManejadorBotones());
		
		mntmAbrirArchivo = new JMenuItem("Abrir archivo");
		mnNewMenu.add(mntmAbrirArchivo);
		mntmAbrirArchivo.addActionListener(new ManejadorBotones());
		
		mntmGuardarArchivo = new JMenuItem("Guardar archivo");
		mnNewMenu.add(mntmGuardarArchivo);
		mntmGuardarArchivo.addActionListener(new ManejadorBotones());
		
		mntmSalir = new JMenuItem("Salir");
		mnNewMenu.add(mntmSalir);
		mntmSalir.addActionListener(new ManejadorBotones());
	}

	class ManejadorBotones implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Object evento = e.getSource();
			
			if(evento == mntmCrearArchivo){
	        	cuadroDialogo = new FileDialog(frmLeerguardarFichero,"Guardar",FileDialog.SAVE);
	        	cuadroDialogo.setVisible(true);
	        	ruta = cuadroDialogo.getDirectory() + cuadroDialogo.getFile();
	        	textArea.setEnabled(true);
	    		btnGrabar.setBounds(165, 365, 89, 23);
	        }
			
			if(evento == btnGrabar){
	        	try{
	        		flujoSalida = new FileWriter(ruta);
		        	flujoSalida.write(textArea.getText());
		        	flujoSalida.close();
		        	JOptionPane.showMessageDialog(frmLeerguardarFichero, "El fichero ha sido creado");
		    		btnGrabar.setBounds(0, 0, 0, 0);
		        	textArea.setEnabled(false);
		        	textArea.setText("");
	        	}
	        	catch(IOException error){
	        		System.out.println(error.getMessage());
	        	}
			}
			
			if(evento == mntmAbrirArchivo){
        		String linea;
        		String eof = null;
				cuadroDialogo = new FileDialog(frmLeerguardarFichero,"Guardar",FileDialog.LOAD);
	        	cuadroDialogo.setVisible(true);
	        	ruta = cuadroDialogo.getDirectory() + cuadroDialogo.getFile();
	        	textArea.setEnabled(true);
	        	try{
	        		textArea.setEnabled(true);
	        		fichero = new File(ruta);
		        	flujoBr = new BufferedReader(new FileReader(ruta));
					
						while ((linea = flujoBr.readLine()) != eof)
							textArea.append(linea + "\n");
		        	
		        	flujoBr.close();
	        	}
	        	catch(IOException error){
	        		System.out.println(error.getMessage());
	        	}
			}
			
			if(evento == mntmGuardarArchivo){
	        	try{
	        		flujoSalida = new FileWriter(ruta);
		        	flujoSalida.write(textArea.getText());
		        	flujoSalida.close();
		        	JOptionPane.showMessageDialog(frmLeerguardarFichero, "El fichero ha sido actualizado");
		        	textArea.setEnabled(false);
		        	textArea.setText("");
		        	
	        	}
	        	catch(IOException error){
	        		System.out.println(error.getMessage());
	        	}
			}
			
			if(evento == mntmSalir){
				System.exit(0);
			}
			
		}
	}
}


