package com.ldh.weka.ProyectoFinal_LDH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JPanel;

public class interfazGrafica {

	private JFrame frmProyectoFinalWeka;
	private JTextField textField;
	JScrollPane scroll, scroll2; 
	File archivo = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfazGrafica window = new interfazGrafica();
					window.frmProyectoFinalWeka.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public interfazGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProyectoFinalWeka = new JFrame();
		frmProyectoFinalWeka.setBounds(100, 100, 654, 604);
		frmProyectoFinalWeka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProyectoFinalWeka.getContentPane().setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scroll = new JScrollPane(textArea);    
        scroll.setBounds(new Rectangle(23,211,286,344));                                                    
        frmProyectoFinalWeka.add(scroll);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		scroll2 = new JScrollPane(textArea_1);    
        scroll2.setBounds(new Rectangle(330,211,286,344));                                                    
        frmProyectoFinalWeka.add(scroll2);
		
		JLabel lblDatos = new JLabel("DATOS");
		lblDatos.setBounds(141, 186, 46, 14);
		frmProyectoFinalWeka.getContentPane().add(lblDatos);
		
		JLabel lblResultado = new JLabel("RESULTADO");
		lblResultado.setBounds(442, 186, 79, 14);
		frmProyectoFinalWeka.getContentPane().add(lblResultado);
		
		JButton btnNewButton = new JButton("K-MEANS");
		btnNewButton.setBounds(23, 79, 132, 23);
		frmProyectoFinalWeka.getContentPane().add(btnNewButton);
		
		JButton btnRegresionS = new JButton("REGRESION S");
		btnRegresionS.setBounds(177, 79, 132, 23);
		frmProyectoFinalWeka.getContentPane().add(btnRegresionS);
		
		JButton btnRegresinM = new JButton("REGRESIÓN M");
		btnRegresinM.setBounds(330, 79, 132, 23);
		frmProyectoFinalWeka.getContentPane().add(btnRegresinM);
		
		JButton btnRamdonForest = new JButton("RAMDON FOREST");
		btnRamdonForest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*textArea_1.setText("");
				Algoritmos_MA alg = new Algoritmos_MA(textField.getText());
				alg.setTipo(1);
				textArea_1.setText(alg.ejecutarRandomForest());	*/			
			}
		});
		btnRamdonForest.setBounds(483, 79, 132, 23);
		frmProyectoFinalWeka.getContentPane().add(btnRamdonForest);
		
		JButton btnMp = new JButton("MP5");
		btnMp.setBounds(23, 129, 135, 23);
		frmProyectoFinalWeka.getContentPane().add(btnMp);
		
		JButton btnZeror = new JButton("ZeroR");
		btnZeror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*textArea_1.setText("");
				Algoritmos_MA alg = new Algoritmos_MA(textField.getText());
				alg.setTipo(1);
				textArea_1.setText(alg.ejecutarZeroR());*/				
			}
		});
		btnZeror.setBounds(177, 129, 132, 23);
		frmProyectoFinalWeka.getContentPane().add(btnZeror);
		
		JButton btnJ = new JButton("J48");
		btnJ.addActionListener(new ActionListener() {	
		public void actionPerformed(ActionEvent e) {
			J48Tree j48 = new J48Tree(archivo);
			try {
				textArea_1.setText(j48.resultado);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		});
		btnJ.setBounds(330, 129, 132, 23);
		frmProyectoFinalWeka.getContentPane().add(btnJ);
		
		JButton btnKstart = new JButton("KStart");
		btnKstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*LazyKStar kstar = new LazyKStar(archivo);
				try {
					textArea_1.setText(kstar.PrintResult());
				} catch (Exception e1) {
					e1.printStackTrace();
				}*/
			}
		});
		btnKstart.setBounds(483, 129, 132, 23);
		frmProyectoFinalWeka.getContentPane().add(btnKstart);
		
		JLabel lblSeleccionarFichero = new JLabel("SELECCIONAR FICHERO");
		lblSeleccionarFichero.setBounds(23, 38, 132, 14);
		frmProyectoFinalWeka.getContentPane().add(lblSeleccionarFichero);
		
		final JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		        
		        JFileChooser selectorArchivos = new JFileChooser();
		        selectorArchivos.setMultiSelectionEnabled(true);
		        selectorArchivos.setFileFilter(new FileNameExtensionFilter("ARFF","arff"));
				selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				int resultado = selectorArchivos.showOpenDialog(btnAbrir);
				archivo = selectorArchivos.getSelectedFile();
				textField.setText(archivo.getAbsolutePath());
				Scanner scn = null;
				try {
					scn = new Scanner(archivo);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				while (scn.hasNext()) {
					textArea.insert(scn.nextLine() + "\n", textArea.getText().length());
				}
			}
		});
		btnAbrir.setBounds(504, 34, 89, 23);
		frmProyectoFinalWeka.getContentPane().add(btnAbrir);
		
		textField = new JTextField();
		textField.setBounds(154, 35, 327, 20);
		textField.setEditable(false);
		frmProyectoFinalWeka.getContentPane().add(textField);
		textField.setColumns(10);
	}
}