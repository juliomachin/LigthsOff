package ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;


public class ui2 extends ui1{
	private JTextField txtFilas, txtColumnas, txtFicheroGrabar , txtFicheroCarga , txtFicheroSol ;
	private JLabel lblTitulo, lblColumnas, lblFilas;
	private JRadioButton rdbtnICrear, rdbtnIiGrabarFichero, rdbtnIiicargarFichero, rdbtnIvDefinirSolucion, rdbtnVGrabarSolucion;
	private JButton btnAceptarCrear , btnBrowserGrabar, btnBrowserCarga, btnAceptarGrabar, btnGuardar, btnAceptarCarga, btnBrowserSol, btnAceptarSol, btnCargarSol ;
	public int  valueFil, valueCol; 
	
	public  ui2(){
		
		
		getContentPane().setLayout(new MigLayout("", "[][][][][][][grow][][][][grow][][][][grow]", "[][][][][][][][][][][]"));
		
		lblTitulo = new JLabel("¿QUE QUIERES HACER?");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblTitulo, "cell 10 0 2 1");
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_4, "cell 1 1");
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_3, "cell 10 1");
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_5, "cell 14 1");
		
		ButtonGroup grupo = new ButtonGroup();
		
		
		rdbtnICrear = new JRadioButton("I. Crear");
		rdbtnICrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deshabilitar();
				txtFilas.setEnabled(true);
				txtColumnas.setEnabled(true);
				btnAceptarCrear.setEnabled(true);
			}
		});
		grupo.add(rdbtnICrear);
		getContentPane().add(rdbtnICrear, "cell 1 2");
		
		lblFilas = new JLabel("Filas");
		getContentPane().add(lblFilas, "cell 9 2,alignx left");
		
		txtFilas = new JTextField();
		getContentPane().add(txtFilas, "cell 10 2,growx");
		
		
		
		lblColumnas = new JLabel("Columnas");
		getContentPane().add(lblColumnas, "cell 11 2");
		
		
		
		btnAceptarCrear = new JButton("Aceptar");
		btnAceptarCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("LLegue");

				ui4 r = new ui4();
				r.setVisible(true);
				r.btnBuscarCargar.setEnabled(false);
				r.btnBuscarGrabar.setEnabled(false);
				r.btnCargar.setEnabled(false);
				r.btnGuargar.setEnabled(false);
				r.txtGrabar.setEnabled(false);;
				r.txtGuardar.setEnabled(false);
				r.lblSolucin.setEnabled(false);
				r.btnDefinirSol.setEnabled(false);
				r.btnGrabarSol.setVisible(false);
				r.btnBuscarCargar.setVisible(false);
				r.btnBuscarGrabar.setVisible(false);
				r.btnCargar.setVisible(false);
				r.btnGuargar.setVisible(false);
				r.txtGrabar.setVisible(false);;
				r.txtGuardar.setVisible(false);
				r.lblSolucin.setVisible(false);
				r.btnDefinirSol.setVisible(false);
				r.btnGrabarSol.setVisible(false);
				
			}
			
			
		});
		
		txtColumnas = new JTextField();
		getContentPane().add(txtColumnas, "cell 12 2 2 1,growx");
		getContentPane().add(btnAceptarCrear, "cell 14 2");
		
		Component verticalStrut = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut, "cell 1 3");
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_1, "cell 10 3");
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_2, "cell 14 3");
		
		rdbtnIiGrabarFichero = new JRadioButton("II. Grabar Fichero");
		rdbtnIiGrabarFichero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deshabilitar();
				txtFicheroGrabar.setEditable(false);
				btnBrowserGrabar.setEnabled(true);
				btnAceptarGrabar.setEnabled(true);
			}
		});
		
		
		grupo.add(rdbtnIiGrabarFichero);
		
		getContentPane().add(rdbtnIiGrabarFichero, "cell 1 4");
		
		txtFicheroGrabar = new JTextField();
		getContentPane().add(txtFicheroGrabar, "cell 6 4 5 1,growx");
		txtFicheroGrabar.setColumns(10);
		
		btnBrowserGrabar = new JButton("Browser");
		getContentPane().add(btnBrowserGrabar, "cell 11 4");
		
		btnAceptarGrabar = new JButton("Aceptar");
		getContentPane().add(btnAceptarGrabar, "cell 14 4,alignx right");
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_6, "cell 1 5");
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_7, "cell 10 5");
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_8, "cell 14 5");
		
		rdbtnIiicargarFichero = new JRadioButton("III.Cargar Fichero");
		rdbtnIiicargarFichero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deshabilitar();
				txtFicheroCarga.setEditable(false);
				btnBrowserCarga.setEnabled(true);
				btnAceptarCarga.setEnabled(true);
				btnGuardar.setEnabled(true);
			}
		});
		getContentPane().add(rdbtnIiicargarFichero, "cell 1 6");
		
		grupo.add(rdbtnIiicargarFichero);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		getContentPane().add(horizontalStrut, "cell 5 6");
		
		txtFicheroCarga = new JTextField();
		getContentPane().add(txtFicheroCarga, "cell 6 6 5 1,growx");
		txtFicheroCarga.setColumns(10);
		
		btnBrowserCarga = new JButton("Browser");
		getContentPane().add(btnBrowserCarga, "cell 11 6,alignx right");
		
		btnGuardar = new JButton("Guardar");
		getContentPane().add(btnGuardar, "cell 13 6");
		
		btnAceptarCarga = new JButton("Aceptar");
		getContentPane().add(btnAceptarCarga, "cell 14 6,alignx right");
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_9, "cell 1 7");
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_10, "cell 10 7");
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_11, "cell 14 7");
		
		rdbtnIvDefinirSolucion = new JRadioButton("IV. Definir Solucion");
		rdbtnIvDefinirSolucion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deshabilitar();
				/*
				 * Primero implementar en la ui
				 * Habilitar las funciones necesarias
				 * 
				 */
			}
		});
		getContentPane().add(rdbtnIvDefinirSolucion, "cell 1 8");
		
		grupo.add(rdbtnIvDefinirSolucion);
		
		Component verticalStrut_12 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_12, "cell 1 9");
		
		Component verticalStrut_13 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_13, "cell 10 9");
		
		Component verticalStrut_14 = Box.createVerticalStrut(20);
		getContentPane().add(verticalStrut_14, "cell 14 9");
		
		rdbtnVGrabarSolucion = new JRadioButton("V. Grabar Solucion");
		rdbtnVGrabarSolucion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deshabilitar();
				txtFicheroSol.setEditable(false);
				btnBrowserSol.setEnabled(true);
				btnAceptarSol.setEnabled(true);
				btnCargarSol.setEnabled(true);
				
			}
		});
		getContentPane().add(rdbtnVGrabarSolucion, "cell 1 10");
		
		
		grupo.add(rdbtnVGrabarSolucion);
		
		txtFicheroSol = new JTextField();
		getContentPane().add(txtFicheroSol, "cell 10 10,growx");
		txtFicheroSol.setColumns(10);
		
		btnBrowserSol = new JButton("Browser");
		getContentPane().add(btnBrowserSol, "cell 11 10");
		
		btnCargarSol = new JButton("Cargar");
		getContentPane().add(btnCargarSol, "cell 13 10");
		
		btnAceptarSol = new JButton("Aceptar");
		getContentPane().add(btnAceptarSol, "cell 14 10");
		
	}
	
	public void deshabilitar(){
		txtFilas.setEnabled(false);
		txtColumnas.setEnabled(false);
		txtFicheroCarga.setEnabled(false);
		txtFicheroGrabar.setEnabled(false);
		txtFicheroSol.setEnabled(false);
		btnAceptarCarga.setEnabled(false);
		btnAceptarCrear.setEnabled(false);
		btnAceptarGrabar.setEnabled(false);
		btnAceptarSol.setEnabled(false);
		btnBrowserCarga.setEnabled(false);
		btnBrowserGrabar.setEnabled(false);
		btnBrowserSol.setEnabled(false);
		btnGuardar.setEnabled(false);
		btnCargarSol.setEnabled(false);
	
		
	}

}
