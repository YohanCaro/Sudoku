package co.yohan.gms.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import co.yohan.gms.constants.Constans;

/**
 * Clase ButtonsOptionsPanel - Clase que crea los botones del area de juego
 * 
 * @version 1.1 - 28/10/2018
 * @author Yohan Caro
 *
 */
public class ButtonsOptionsPanel extends JPanel {
	
	private JButton bReset, bNewGame, bOut;
	private MainWindow window;
	
	public ButtonsOptionsPanel(MainWindow window) {
		this.window = window;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10), BorderFactory.createTitledBorder(null, "Options", 1, 1,
				new Font("Rockwell Extra Bold", 1, 18), Color.darkGray)));
		this.init();
	}
	
	private void init() {		
		this.add(Box.createRigidArea(new Dimension(5, 20)));
		
		this.bNewGame = new JButton("New Game");
		this.bNewGame.setActionCommand(Constans.NEW_GAME_ACT);
		this.bNewGame.addActionListener(window.getEvents());
		this.add(bNewGame);
		
		this.add(Box.createRigidArea(new Dimension(5, 20)));
		
		this.bReset = new JButton("Reset");
		this.bReset.setActionCommand(Constans.RESET_ACT);
		this.bReset.addActionListener(window.getEvents());
		this.add(bReset);
		
		this.add(Box.createRigidArea(new Dimension(5, 20)));
		
		this.bOut = new JButton("Leave Game");
		this.bOut.setActionCommand(Constans.GO_OUT);
		this.bOut.addActionListener(window.getEvents());
		this.add(bOut);
	}

	public JButton getbReset() {
		return bReset;
	}

	public JButton getbNewGame() {
		return bNewGame;
	}

	public JButton getbOut() {
		return bOut;
	}

}
