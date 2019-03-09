package co.yohan.gms.view;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase Title - Clase que crea un titulo en el juego 
 * 
 * @version 1.0 - 22/10/2018
 * @author Yohan Caro
 *
 */
public class Title extends JPanel{
	
	private JLabel lTitle;

	public Title() {
		this.init();
	}
	
	private void init() {
		lTitle = new JLabel("Sudoku Game");
		lTitle.setFont(new Font("Rockwell Extra Bold", 1, 35));
		this.add(lTitle);
	}
}
