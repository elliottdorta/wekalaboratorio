package com.ldh.weka.ProyectoFinal_LDH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class interfazGrafica {

	private JFrame frmProyectoFinalWeka;
	private JTextField textField;

	/**
	 * Main Principal de la Ventana.
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
	 * Crea la aplicación.
	 */
	public interfazGrafica() {
		initialize();
	}

	/**
	 * Inicializa el contennido del frame.
	 */
	private void initialize() {
		frmProyectoFinalWeka = new JFrame();
		frmProyectoFinalWeka.getContentPane().setBackground(Color.WHITE);
		frmProyectoFinalWeka.getContentPane().setLayout(null);
		
		JButton btnCargarArchvio = new JButton("Cargar Archvio");
		btnCargarArchvio.addActionListener(new ActionListener() {
			File[] retorno = null;
			public void actionPerformed(ActionEvent e) {
				retorno = new FileSelector().chooseFiles();
                if(retorno != null){
                		System.out.println( "Fichero cargado correctamente" );
                }
			}
		});
		btnCargarArchvio.setBounds(12, 44, 124, 23);
		frmProyectoFinalWeka.getContentPane().add(btnCargarArchvio);
		
		JLabel lblProyectoFinalDe = new JLabel("Proyecto final de Laboratorio de Desarrollo y Herramientas");
		lblProyectoFinalDe.setFont(new Font("Dialog", Font.BOLD, 15));
		lblProyectoFinalDe.setBounds(80, 16, 468, 16);
		frmProyectoFinalWeka.getContentPane().add(lblProyectoFinalDe);
		
		textField = new JTextField();
		textField.setBounds(143, 45, 423, 20);
		frmProyectoFinalWeka.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnKmeans = new JButton("K-MEANS");
		btnKmeans.setBounds(12, 102, 98, 26);
		frmProyectoFinalWeka.getContentPane().add(btnKmeans);
		
		JButton btnRegresinS = new JButton("REGRESIÓN S");
		btnRegresinS.setBounds(133, 102, 111, 26);
		frmProyectoFinalWeka.getContentPane().add(btnRegresinS);
		
		JButton btnRegresinM = new JButton("REGRESIÓN M");
		btnRegresinM.setBounds(274, 102, 124, 26);
		frmProyectoFinalWeka.getContentPane().add(btnRegresinM);
		
		JButton btnRamdonForest = new JButton("RAMDON FOREST");
		btnRamdonForest.setBounds(420, 102, 146, 26);
		frmProyectoFinalWeka.getContentPane().add(btnRamdonForest);
		
		JButton btnMp = new JButton("MP5");
		btnMp.setBounds(38, 153, 98, 26);
		frmProyectoFinalWeka.getContentPane().add(btnMp);
		
		JButton btnZeror = new JButton("ZeroR");
		btnZeror.setBounds(165, 153, 98, 26);
		frmProyectoFinalWeka.getContentPane().add(btnZeror);
		
		JButton btnJ = new JButton("J48");
		btnJ.setBounds(301, 153, 98, 26);
		frmProyectoFinalWeka.getContentPane().add(btnJ);
		
		JButton btnKstart = new JButton("KStart");
		btnKstart.setBounds(436, 153, 98, 26);
		frmProyectoFinalWeka.getContentPane().add(btnKstart);
		
		JLabel lblNewLabel = new JLabel("Resultados");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(38, 202, 515, 239);
		frmProyectoFinalWeka.getContentPane().add(lblNewLabel);
		frmProyectoFinalWeka.setBackground(Color.RED);
		frmProyectoFinalWeka.setTitle("Proyecto Final Weka LDH 2017/18");
		frmProyectoFinalWeka.setBounds(100, 100, 614, 792);
		frmProyectoFinalWeka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}