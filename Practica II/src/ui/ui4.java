package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;

public class ui4 extends JFrame implements ActionListener{

	private int alturaMax = 100;
	private int anchoMax = 30;

	int filas ;
	int columnas;
	
	JPanel panel_1;
	JPanel panel_2;

	JButton btnCrear;
	JTextField txtColumnas;
	JTextField txtFilas;
	JPanel panel;
	JButton btnGuargar;
	JTextField txtGrabar;
	JButton btnBuscarGrabar;
	JTextField txtGuardar;
	JButton btnCargar;
	JButton btnBuscarCargar;
	JButton btnGrabarSol;
	JLabel lblSolucin;
	JLabel lblColumnas;
	JLabel lblFilas;
	JButton btnDefinirSol;
	

	public ui4() {

		panel = new JPanel( null );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Se agrega el panel a boton
		getContentPane().add(panel, BorderLayout.NORTH);

		panel_1 = new JPanel();


		panel_2 = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 954, GroupLayout.PREFERRED_SIZE)
						.addGap(23))
				);
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 679, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 571, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(269, Short.MAX_VALUE))
				);

		lblFilas = new JLabel();
		lblFilas.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		lblFilas.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilas.setText("Filas");


		lblColumnas = new JLabel();
		lblColumnas.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		lblColumnas.setHorizontalAlignment(SwingConstants.CENTER);
		lblColumnas.setText("Columnas");


		txtFilas = new JTextField();

		txtFilas.setPreferredSize(new Dimension(50, 25));
		txtColumnas = new JTextField();

		txtColumnas.setPreferredSize(new Dimension(50, 25));
		btnCrear = new JButton();

		btnCrear.setText("Crear");
		btnCrear.addActionListener(this);

		txtGrabar = new JTextField();
		txtGrabar.setColumns(10);

		btnGuargar = new JButton("Grabar");
		btnGuargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnBuscarGrabar = new JButton("Buscar");
		btnBuscarGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		txtGuardar = new JTextField();
		txtGuardar.setColumns(10);

		btnCargar = new JButton("Cargar");

		btnBuscarCargar = new JButton("Buscar");

		lblSolucin = new JLabel("Soluci\u00F3n");
		lblSolucin.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		lblSolucin.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		btnGrabarSol = new JButton("Grabar");
		btnGrabarSol.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		btnGrabarSol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnDefinirSol = new JButton("Definir");
		btnDefinirSol.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFilas, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblColumnas, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(txtFilas, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtColumnas, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCrear, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(txtGrabar, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnGuargar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnBuscarGrabar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel_2.createSequentialGroup()
								.addComponent(lblSolucin, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
									.addComponent(btnDefinirSol, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
									.addComponent(btnGrabarSol, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
							.addGroup(gl_panel_2.createSequentialGroup()
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
									.addComponent(txtGuardar, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnBuscarCargar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnCargar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(40)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtFilas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFilas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblColumnas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtColumnas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(55)
							.addComponent(btnCrear, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
					.addGap(70)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(txtGrabar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnBuscarGrabar))
						.addComponent(btnGuargar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(txtGuardar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBuscarCargar))
						.addComponent(btnCargar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(64)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(btnDefinirSol, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnGrabarSol, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblSolucin, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(33)))
					.addGap(51))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 954, Short.MAX_VALUE)
				);
		gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 637, Short.MAX_VALUE)
				);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);


		this.setSize(1394, 774);
		//Permite que la ventana se coloque al centro de la pantalla
		this.setLocationRelativeTo(null);

	}





	/*public void tablero() {

		Boton b = new Boton(filas, columnas, alturaMax, anchoMax);




		String f = txtFilas.getText();

		String c = txtColumnas.getText();

		filas = Integer.parseInt(f);
		columnas = Integer.parseInt(c);

		Boton [][] botones = new Boton[filas][columnas];

		for(int i = 0; i <= filas; i++){

			for(int j = 0; j <= j; j++){

				botones[i][j] = new Boton( 75 * j, 30 * i, alturaMax,anchoMax );
				//botones[i][j].setNombre(i, j);
				//panel.add(botones[i][j]);
			}
		}
		panel.updateUI();
	}*/




















	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
