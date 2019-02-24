package co.yohan.gms.view;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

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
