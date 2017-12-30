package ui;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SingleSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;


import javax.swing.JPanel;
import javax.swing.JSpinner;
import java.awt.Choice;
import java.awt.Dialog.ModalityType;

import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ui1 extends JFrame{
	
	public  JFrame frame1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ui1 n = new ui1();
					n.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ui1(){
		
		frame1 = new JFrame("PASATIEMPOS");
		frame1.setFont(new Font("Goudy Stout", Font.BOLD, 12));
		frame1.getContentPane().setBackground(new Color(255, 255, 255));
		frame1.setSize(650,400);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton bCrear = new JButton("CREAR");
		bCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ui2 ventana2 = new ui2();
				ventana2.setVisible(true);
				ventana2.setSize(688,380);
			}
		});
		bCrear.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		bCrear.setBackground(new Color(204, 255, 204));
		
		JButton bResolve = new JButton("RESOLVER");
		bResolve.setBackground(new Color(255, 255, 204));
		bResolve.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		bResolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ui3 ventana3 = new ui3();
				ventana3.setVisible(true);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame1.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(97)
					.addComponent(bCrear, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addGap(100)
					.addComponent(bResolve, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(106, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(146)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(bCrear, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(bResolve, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(202, Short.MAX_VALUE))
		);
		frame1.getContentPane().setLayout(groupLayout);
		
		
	}
}