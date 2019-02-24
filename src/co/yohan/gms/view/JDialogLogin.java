package co.yohan.gms.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.yohan.gms.constants.Constans;

/**
 * Class JDialogLogin - Crea el dialog del login
 * @version 1.0 - 26/09/2018
 * @author Yohan Caro
 *
 */
public class JDialogLogin extends JDialog{
	
	private MainWindow window;
	private Label title;
	private JButton bSign, bExit, bUpdates;

	/**
	 * Constructor para crear el JDialog
	 */
	public JDialogLogin(MainWindow window) {
		this.window = window;
		this.setTitle("Sudoku Game! (Alpha)");
		this.setSize(400,300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.init();
		this.icon();
		this.setVisible(true);
	}
	
	/**
	 * Metodo que iniciaiza los componentes del dialog
	 */
	private void init() {
		JPanel panelAux = new JPanel();
		bSign = new JButton("Play");
		bSign.setBackground(Color.CYAN);
		bSign.setActionCommand(Constans.SIGN_PANEL_ACT);
		bSign.addActionListener(window.getEvents());
		panelAux.add(bSign);
		
		bUpdates = new JButton("What's new?");
		bUpdates.setBackground(Color.CYAN);
		bUpdates.setActionCommand(Constans.UPDATES_ACT);
		bUpdates.addActionListener(window.getEvents());
		panelAux.add(bUpdates);
		
		bExit = new JButton("Exit");
		bExit.setBackground(Color.CYAN);
		bExit.setActionCommand(Constans.EXIT_PANEL_ACT);
		bExit.addActionListener(window.getEvents());
		panelAux.add(bExit);
		this.add(panelAux, BorderLayout.SOUTH);
		
		title = new Label("SUDOKU!");
		title.setFont(new Font("Rockwell Extra Bold", 1, 80));
		this.add(title, BorderLayout.CENTER);
	}
	
	public void icon() {
		ImageIcon icon = new ImageIcon("src/res/icons/NEO.png");
		ImageIcon icon2 = new ImageIcon(icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		this.setIconImage(icon2.getImage());	
	}
	

	/**
	 * Obtiene el boton para visualizar el panel para iniciar seción!
	 * @return bSign
	 */
	public JButton getbSign() {
		return bSign;
	}
	
}
